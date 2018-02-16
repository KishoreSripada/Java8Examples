package com.java8.examples.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("one","two","three");
        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        stringStream
           .filter(p1)
           .filter(p2.or(p3))
           .forEach(System.out::println);
    }
}