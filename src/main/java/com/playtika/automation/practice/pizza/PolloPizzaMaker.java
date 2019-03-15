package com.playtika.automation.practice.pizza;

public class PolloPizzaMaker extends AbstractPizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили твердый сыр, оливки, помидоры, сметану");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем...");
        try {
            Thread.sleep(25_000);
        }
        catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }

    @Override
    protected String build() {
        return "Полло";
    }
}
