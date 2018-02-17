package com.java8.examples.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinalExample {
    public static void main(String[] args) {
        Stream<String> stringStream4Intermediary = Stream.of("one","two","three","four","five");
        Stream<String> stringStream4Final = Stream.of("one","two","three","four","five");

        // The below line does not print anything as peek returns a stream and is an
        // intermediary operation
        stringStream4Intermediary.
                filter(Predicate.isEqual("three").or(Predicate.isEqual("five"))).
                peek(System.out::println);

        // The below line prints one and two as forEach does not return anything and is a
        // final operation
        stringStream4Final.
                filter(Predicate.isEqual("one").or(Predicate.isEqual("two"))).
                forEach(System.out::println);
    }
}
