package com.isa.patterns.chainofresponsibility.independent;

public interface Filter {

    void filter(Input input, Output output, FilterChain filterChain);

    boolean supports(Input input);
}
