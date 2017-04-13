package com.isa.patterns.proxy.delaying;

public class DelayingServiceProxy implements ExpensiveService {
    @Override
    public void create() {
        ValueHolder.INSTANCE.create();
    }

    private static class ValueHolder {
        private ValueHolder(){}

        static final ExpensiveService INSTANCE = new ExpensiveServiceImpl();
    }
}
