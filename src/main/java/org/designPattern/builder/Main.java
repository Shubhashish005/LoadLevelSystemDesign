package org.designPattern.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger
                .BurgerBuilder()
                .egg(true)
                .extraCheese(true)
                .lettuce(true)
                .size("2")
                .onion(true)
                .build();

    }
}
