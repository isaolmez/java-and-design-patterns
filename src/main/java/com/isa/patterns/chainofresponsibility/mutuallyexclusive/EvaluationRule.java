package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

public interface EvaluationRule {

    EvaluationResult evaluate(int points);
}
