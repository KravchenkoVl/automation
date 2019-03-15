package com.playtika.automation.practice.pizza;

public class PizzaAutomate {

    private final PizzaMakerFactory pizzaMakerFactory;

    public PizzaAutomate(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public String getPizza(Button button) {
        AbstractPizzaMaker maker = pizzaMakerFactory.getPizzaMaker(button);
        return maker.makePizza();
    }

    public static void main(String[] args) {
        PizzaAutomate check = new PizzaAutomate(new UkrainePizza());
        String pizza = check.getPizza(Button.BUTTON_1);
        System.out.println(pizza);
    }
}
