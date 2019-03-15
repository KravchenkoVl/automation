package com.playtika.automation.practice.pizza;

public class FourCheasesPizzaMaker extends AbstractPizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили твердый сыр, моцареллу, сыр с плесенью, ");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем...");
        try {
            Thread.sleep(10_000);
        }
        catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }

    @Override
    protected String build() {
        return "4 сыра";
    }
}
