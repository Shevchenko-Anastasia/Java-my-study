package net.study.basic.lesson4;

public class TestBurger {
    public static void main(String[] args) {
        Burger myBurger1 = new Burger("bun", "onion", "salad", "tomato", "meatKotlette");

        Burger myBurger2 = new Burger("bun", "onion", "salad", "tomato");

        System.out.println("myBurger1 is dietician: " + myBurger1.isDietician());
        System.out.println("myBurger2 is dietician: " + myBurger2.isDietician());
    }
}
