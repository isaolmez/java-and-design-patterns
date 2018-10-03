package com.isa.patterns.chainofresponsibility.independent;

public interface FilterChain extends Filter {

    void start(Input input, Output output);
}
