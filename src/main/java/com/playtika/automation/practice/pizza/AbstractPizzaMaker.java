package com.playtika.automation.practice.pizza;

public abstract class AbstractPizzaMaker {
    public String makePizza(){
        takeBase();
        fillIngredients();
        bakePizza();
        cut();
        pack();
        return build();
    }

    protected abstract void fillIngredients();

    protected abstract void bakePizza();

    protected abstract String build();

    private void takeBase() {
        System.out.println("Взяли заготовку");
    }

    private void cut() {
        System.out.println("Пицца нарезана на 8 кусочков");
    }

    private void pack() {
        System.out.println("Пицца упакована");
    }
}
