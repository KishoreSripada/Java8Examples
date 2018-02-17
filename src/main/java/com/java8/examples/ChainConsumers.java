package com.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        Consumer<String> c1 = list::add;
        Consumer<String> c2 = System.out::println;

        list1.stream().forEach(c1.andThen(c2));
    }
}
