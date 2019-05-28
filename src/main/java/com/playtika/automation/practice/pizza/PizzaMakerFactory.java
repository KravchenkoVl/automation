package com.playtika.automation.practice.pizza;

public interface PizzaMakerFactory {
    AbstractPizzaMaker getPizzaMaker(Button button);
}
