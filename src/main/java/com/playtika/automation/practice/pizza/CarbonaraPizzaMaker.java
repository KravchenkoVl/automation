package com.playtika.automation.practice.pizza;

public class CarbonaraPizzaMaker extends AbstractPizzaMaker {

    @Override
    protected void fillIngredients() {
        System.out.println("Добавили бекон, яйцо, сыр, сливочный соус, чеснок");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Выпекаем...");
        try {
            Thread.sleep(5_000);
        }
        catch (InterruptedException e){
            System.out.println("Прервано");
        }
    }

    @Override
    protected String build() {
        return "Карбонара";
    }
}
