package com.playtika.automation.practice.pizza;

public class UkrainePizza implements PizzaMakerFactory {
    @Override
    public AbstractPizzaMaker getPizzaMaker(Button button) {
        switch (button) {
            case BUTTON_1: {
                return new CarbonaraPizzaMaker();
            }
            case BUTTON_2: {
                return new PepperoniPizzaMaker();
            }
            case BUTTON_3: {
                return new FourCheasesPizzaMaker();
            }
            case BUTTON_4: {
                return new PolloPizzaMaker();
            }
        }
        throw new IllegalStateException();
    }
}
