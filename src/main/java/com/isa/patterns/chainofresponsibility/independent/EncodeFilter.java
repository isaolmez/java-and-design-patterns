package com.isa.patterns.chainofresponsibility.independent;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class EncodeFilter implements Filter {

    @Override
    public void filter(Input input, Output output, FilterChain filterChain) {
        try {
            String outputValue = output.getValue() != null ? output.getValue() : input.getValue();
            String encoded = URLEncoder.encode(outputValue, StandardCharsets.UTF_8.name());
            output.setValue(encoded);
            output.incrementFilteredCount();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } finally {
            filterChain.filter(input, output, filterChain);
        }
    }

    @Override
    public boolean supports(Input input) {
        return input.getPath().contains("1");
    }
}
