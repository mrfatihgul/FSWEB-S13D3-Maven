package org.example;

public class Person {
    String firstName;
    String lastName;
    String style;
    int age;
    int height;
    int weight;

    public Person(String firstname, String lastname, int age) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
    }

    public Person(String style, int height, int weight, String firstname, String lastname, int age) {
        this(firstname, lastname, age);

        this.style = style;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if (age >= 13 && age <= 19){
            return true;
        }

        else {
            return false;
        }
    }
}
