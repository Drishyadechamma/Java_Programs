package com.atria.day16.collectionframeworkdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Comparabledemo {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();

        p.add(new Person("john", 30));
        p.add(new Person("anil", 20));
        p.add(new Person("baskar", 17));

        Collections.sort(p); // uses compareTo()

        for (Person p1 : p) {
            p1.displayinfo();
        }
    }
}
