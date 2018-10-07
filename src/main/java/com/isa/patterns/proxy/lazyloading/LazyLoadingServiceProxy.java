package com.isa.patterns.proxy.lazyloading;

public class LazyLoadingServiceProxy implements ExpensiveService {

    @Override
    public void create() {
        ValueHolder.INSTANCE.create();
    }

    private static class ValueHolder {

        static final ExpensiveService INSTANCE = new ExpensiveServiceImpl();
    }
}
