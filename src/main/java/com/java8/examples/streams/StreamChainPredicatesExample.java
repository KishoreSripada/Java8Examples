package com.java8.examples.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamChainPredicatesExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i>20;
        Predicate<Integer> p2 = i -> i<30;
        Predicate<Integer> p3 = i -> i == 20;

        Predicate<Integer> p = p1.and(p2).or(p3);
        Predicate<Integer> p4 = p1.and(p2).or(p3);

        Stream<Integer> stream = Stream.of(1,2,3,5,55,6,32,22,0);
        stream.filter(p).forEach(System.out::println);
    }
}
