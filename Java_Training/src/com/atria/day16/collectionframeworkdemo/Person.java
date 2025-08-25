package com.atria.day16.collectionframeworkdemo;

// demo for comparable
public class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayinfo() {
        System.out.println("name: " + name + " age: " + age);
    }

    @Override
   
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    }

