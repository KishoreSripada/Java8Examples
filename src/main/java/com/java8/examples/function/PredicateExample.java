package com.java8.examples.function;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("one","two","three","four","five");

        Predicate<String> p1 = s -> s.length()>3;
        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");


        stringStream.filter(
                p2.or(p3)).forEach(s -> System.out.println(s));
    }
}
