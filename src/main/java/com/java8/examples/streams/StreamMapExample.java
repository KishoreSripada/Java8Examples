package com.java8.examples.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("name1",1));
        personList.add(new Person("name2",2));
        personList.add(new Person("name3",3));
        personList.add(new Person("name4",4));
        personList.add(new Person("name5",5));

        // Map returns a stream, hence it is an intermediary operation and only a declaration
        // and will not be executed
        personList.stream().map( p -> p.getName());
    }
}