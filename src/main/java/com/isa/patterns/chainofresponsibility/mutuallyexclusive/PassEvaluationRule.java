package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

public class PassEvaluationRule extends AbstractEvaluationRule {

    public PassEvaluationRule(EvaluationRule successor) {
        super(successor);
    }

    @Override
    public EvaluationResult evaluate(int points) {
        if (points >= 50) {
            return EvaluationResult.PASS;
        }

        return processNext(points);
    }
}
