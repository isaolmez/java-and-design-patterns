package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

public class ZeroPointEvaluationRule extends AbstractEvaluationRule {

    public ZeroPointEvaluationRule(EvaluationRule successor) {
        super(successor);
    }

    @Override
    public EvaluationResult evaluate(int points) {
        if (points == 0) {
            return EvaluationResult.SKIP;
        }

        return processNext(points);
    }
}
