package com.isa.patterns.chainofresponsibility.independent.nonthreadsafe;

import com.isa.patterns.chainofresponsibility.independent.FilterChain;
import com.isa.patterns.chainofresponsibility.independent.Input;
import com.isa.patterns.chainofresponsibility.independent.Output;

public class ClientMain {

    public static void main(String[] args) {
        FilterChain filterChain = new NonThreadSafeFilterChain();
        for (int i = 0; i < 100; i++) {
            final int pathVariable = i;
            new Thread(() -> {
                Input newInput = new Input(String.format("/%s", pathVariable), "John Doe");
                Output newOutput = new Output();
                filterChain.start(newInput, newOutput);
                System.out.printf("Input: %s, Output: %s%n", newInput, newOutput);
            }).start();
        }
    }
}
