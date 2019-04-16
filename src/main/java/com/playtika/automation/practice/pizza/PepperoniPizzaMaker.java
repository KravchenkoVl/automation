package com.playtika.automation.practice.pizza;

public class PepperoniPizzaMaker extends AbstractPizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили соус томатный, сыр, базилик, колбаски пепперони, моцареллу");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем...");
        try {
            Thread.sleep(4_000);
        }
        catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }

    @Override
    protected String build() {
        return "Пепперони";
    }
}
