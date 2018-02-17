package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {

        List<Integer> integerList1 = Arrays.asList(1,2,3,4,5);
        List<Integer> integerList2 = Arrays.asList(6,7);
        List<Integer> integerList3 = Arrays.asList(8,9,10);

        List<List<Integer>> listList = Arrays.asList(integerList1, integerList2, integerList3);
        System.out.println(listList);

        Function<List<?>, Integer> size = l -> l.size();
        Function<List<Integer>, Stream<Integer>> flatmapper = l -> l.stream();
        listList.stream().flatMap( flatmapper).forEach(System.out::println);
    }
}
