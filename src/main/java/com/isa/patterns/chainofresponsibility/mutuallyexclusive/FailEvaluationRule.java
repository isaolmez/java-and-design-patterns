package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

public class FailEvaluationRule extends AbstractEvaluationRule {

    public FailEvaluationRule(EvaluationRule successor) {
        super(successor);
    }

    @Override
    public EvaluationResult evaluate(int points) {
        if (points > 10 && points < 50) {
            return EvaluationResult.FAIL;
        }

        return processNext(points);
    }
}
