package com.isa.patterns.chainofresponsibility.independent;

public class UpperCaseFilter implements Filter {

    @Override
    public void filter(Input input, Output output, FilterChain filterChain) {
        String outputValue = output.getValue() != null ? output.getValue() : input.getValue();
        String upperCase = outputValue.toUpperCase();
        output.setValue(upperCase);
        output.incrementFilteredCount();

        filterChain.filter(input, output, filterChain);
    }

    @Override
    public boolean supports(Input input) {
        return true;
    }
}
