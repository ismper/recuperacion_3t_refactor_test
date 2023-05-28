package org.example;

public class Student {
    private String name;
    private int age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void print_details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
