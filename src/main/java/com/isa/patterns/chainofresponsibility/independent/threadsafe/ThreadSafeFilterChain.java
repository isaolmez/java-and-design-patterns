package com.isa.patterns.chainofresponsibility.independent.threadsafe;

import com.isa.patterns.chainofresponsibility.independent.EncodeFilter;
import com.isa.patterns.chainofresponsibility.independent.Filter;
import com.isa.patterns.chainofresponsibility.independent.FilterChain;
import com.isa.patterns.chainofresponsibility.independent.Input;
import com.isa.patterns.chainofresponsibility.independent.Output;
import com.isa.patterns.chainofresponsibility.independent.ReplaceFilter;
import com.isa.patterns.chainofresponsibility.independent.UpperCaseFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeFilterChain implements FilterChain {

    private final List<Filter> filters = new CopyOnWriteArrayList<>();

    private static final ThreadLocal<ActiveFilterContext> ACTIVE_CONTEXT = ThreadLocal.withInitial(() -> new ActiveFilterContext());

    public ThreadSafeFilterChain() {
        filters.add(new EncodeFilter());
        filters.add(new ReplaceFilter());
        filters.add(new UpperCaseFilter());
    }

    @Override
    public void start(Input input, Output output) {
        ACTIVE_CONTEXT.get().reset();
        if (supports(input)) {
            filter(input, output, this);
        }
    }

    @Override
    public void filter(Input input, Output output, FilterChain filterChain) {
        final int activeIndex = ACTIVE_CONTEXT.get().index;
        final List<Filter> activeFilters = ACTIVE_CONTEXT.get().filters;
        if (activeIndex < activeFilters.size()) {
            Filter filter = activeFilters.get(activeIndex);
            if (filter != null) {
                ACTIVE_CONTEXT.get().index = activeIndex + 1;
                filter.filter(input, output, this);
            }
        }
    }

    @Override
    public boolean supports(Input input) {
        List<Filter> activeFilters = new ArrayList<>();
        for (Filter filter : filters) {
            if (filter.supports(input)) {
                activeFilters.add(filter);
            }
        }

        ACTIVE_CONTEXT.get().initialize(activeFilters, 0);
        return !activeFilters.isEmpty();
    }

    private static class ActiveFilterContext {

        int index = 0;

        List<Filter> filters = new ArrayList<>();

        public void initialize(List<Filter> filters, int index) {
            this.filters = new ArrayList<>(filters);
            this.index = index;
        }

        public void reset() {
            this.filters = new ArrayList<>();
            this.index = 0;
        }
    }
}
