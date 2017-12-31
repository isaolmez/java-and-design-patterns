package com.isa.patterns.chainofresponsibility.mutuallyexclusive;

public class ClientMain {

    public static void main(String[] args) {
        EvaluationRule passEvaluationRule = new PassEvaluationRule(null);
        EvaluationRule failEvaluationRule = new FailEvaluationRule(passEvaluationRule);
        EvaluationRule zeroPointEvaluationRule = new ZeroPointEvaluationRule(failEvaluationRule);

        EvaluationResult evaluationResult1 = zeroPointEvaluationRule.evaluate(0);
        System.out.println(evaluationResult1);

        EvaluationResult evaluationResult2 = zeroPointEvaluationRule.evaluate(1);
        System.out.println(evaluationResult2);

        EvaluationResult evaluationResult3 = zeroPointEvaluationRule.evaluate(30);
        System.out.println(evaluationResult3);

        EvaluationResult evaluationResult4 = zeroPointEvaluationRule.evaluate(70);
        System.out.println(evaluationResult4);
    }
}
