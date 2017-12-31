package com.isa.patterns.chainofresponsibility.independent;

public class ReplaceFilter implements Filter {

    @Override
    public void filter(Input input, Output output, FilterChain filterChain) {
        String outputValue = output.getValue() != null ? output.getValue() : input.getValue();
        String replaced = outputValue.replace("a", "z");
        output.setValue(replaced);
        output.incrementFilteredCount();

        filterChain.filter(input, output, filterChain);
    }

    @Override
    public boolean supports(Input input) {
        return true;
    }
}
