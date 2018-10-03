package com.isa.patterns.chainofresponsibility.independent.nonthreadsafe;

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

public class NonThreadSafeFilterChain implements FilterChain {

    private final List<Filter> filters = new CopyOnWriteArrayList<>();
    private List<Filter> activeFilters = new CopyOnWriteArrayList<>();
    private int activeIndex = 0;

    public NonThreadSafeFilterChain() {
        filters.add(new EncodeFilter());
        filters.add(new ReplaceFilter());
        filters.add(new UpperCaseFilter());
    }

    @Override
    public void start(Input input, Output output) {
        activeIndex = 0;
        activeFilters = new ArrayList<>();
        if (supports(input)) {
            filter(input, output, this);
        }
    }

    @Override
    public void filter(Input input, Output output, FilterChain filterChain) {
        if (activeIndex < activeFilters.size()) {
            Filter filter = activeFilters.get(activeIndex);
            if (filter != null) {
                activeIndex++;
                filter.filter(input, output, this);
            }
        }
    }

    @Override
    public boolean supports(Input input) {
        for (Filter filter : filters) {
            if (filter.supports(input)) {
                activeFilters.add(filter);
            }
        }

        return !activeFilters.isEmpty();
    }
}
