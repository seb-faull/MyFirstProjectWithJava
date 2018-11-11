package com.teamtreehouse;

import com.teamtreehouse.data.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John Smith");
        String name = person.getName();

        // Type 'sout' as shortcut
        System.out.println(name);
    }
}