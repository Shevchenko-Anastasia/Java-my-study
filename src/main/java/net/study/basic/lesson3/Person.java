package net.study.basic.lesson3;

import java.util.Objects;

public class Person {
    private String name; // declaring property with access modification
    private Integer age;
    private Boolean maritalStatus;
    public static int quantity =0;

    public Person() {
    } //default implicit constructor

    public Person(String name1, String surname, Integer age1, Boolean maritalStatus1) {
        this.name = name1.toUpperCase() + " " + surname.toUpperCase(); //reference to internal object`s properties and methods within class//
        this.age = age1;
        this.maritalStatus = maritalStatus1;
        quantity ++;
    }

    // constructor is a method to initialize object and its values, has the name of the class
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maritalStatus=" + maritalStatus +
                '}';
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public boolean equals(Object o) { // external to internal (this) comparison
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(maritalStatus, person.maritalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, maritalStatus);
    }
}
