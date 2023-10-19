package net.study.basic.lesson3;

import java.util.Base64;


public class TestObject {
    public static void main(String[] args) {
        //Person myPerson = new Person("Anastasia", 30, true); //declare memory and assign data(object) to it//
        //myPerson.name = "Anastasia";
        //myPerson.age = 30;
        //myPerson.maritalStatus = true;
        // System.out.println(myPerson);


        Person myPerson = new Person("Anastasia", "Shevchenko",31, true);
        System.out.println(Person.quantity);

        Person myPerson2 = new Person("Olya", "Kravchuk", 25, false);
        System.out.println(Person.quantity);
        // final boolean equals = myPerson.equals(myPerson2);
        //System.out.println(myPerson);

        Order firstOrder = new Order("Exclusive", "Kiev", "clothes", true, 2);
        Order secondOrder = new Order("Exclusive", "Kiev", "clothes", true, 2);
        Order thirdOrder = new Order("Casual", "Lutsk", "clothes", true, 4);
        System.out.println(firstOrder);
        System.out.println(secondOrder);
        System.out.println(thirdOrder);

        boolean result1 = firstOrder.equals(secondOrder);
        boolean result2 = firstOrder.equals(thirdOrder);
        System.out.println(result1);
        System.out.println(result2);
    }


}



