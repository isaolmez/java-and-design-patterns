package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

import java.util.Optional;

public abstract class AbstractEvaluationRule implements EvaluationRule {

    private Optional<EvaluationRule> successor;

    public AbstractEvaluationRule(EvaluationRule successor) {
        this.successor = Optional.ofNullable(successor);
    }

    protected EvaluationResult processNext(int points) {
        if (successor.isPresent()) {
            return successor.get().evaluate(points);
        } else {
            return EvaluationResult.NONE;
        }
    }
}
