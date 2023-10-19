package net.study.basic.lesson8;

public class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void run(){
        System.out.println(name + " is running");
    }

    public static  void greetings(){
        System.out.println("Hello!");
    }

}
