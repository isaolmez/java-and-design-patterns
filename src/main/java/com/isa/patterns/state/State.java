package com.isa.patterns.state;

/**
 * State pattern resembles to strategy patten in that both promotes algorithms/strategies changable at runtime. But their purpose is
 * different. Strategy clients use one strategy and perform with it. State clients are bound to use different state objects changing
 * constantly at runtime.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
