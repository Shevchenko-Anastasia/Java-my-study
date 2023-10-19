package net.study.basic.lesson5;

public class Car {
    public String brand;
    public String colour;
    public int velocity;

    public Car(String brand, String colour, int velocity) {
        this.brand = brand;
        this.colour = colour;
        this.velocity = velocity;
    }

    public Car(String brand, String colour) {
        //this(brand, colour, 100);

        this.brand = brand;
        this.colour = colour;
        //this.velocity = 100;
    }

    public Car(String brand) {
        this(brand, "red");
    }

    public Car() {
        this ("mercedez");
    }



}
