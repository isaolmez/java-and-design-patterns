package com.isa.patterns.adapter;

public class ClientMain {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("----Turkey");
        turkey.gobble();
        turkey.fly();

        System.out.println("----Duck");
        testIt(duck);

        System.out.println("----Turkey Adapter");
        testIt(turkeyAdapter);
    }

    public static void testIt(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
