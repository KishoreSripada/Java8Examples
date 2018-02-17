package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExampleForSum {
    public static void main(String[] args) {

        // Sum (Looks good for all cases)
        // Empty list
        List<Integer> list = Arrays.asList();
        System.out.println(list.stream().reduce(0, Integer::sum));

        // list holding one value
        List<Integer> listWithOneElement = Arrays.asList(1);
        System.out.println(listWithOneElement.stream().reduce(0, Integer::sum));

        // list holding multiple values
        List<Integer> nonZeroIdentityListWithMultipleElements = Arrays.asList(10);
        System.out.println(nonZeroIdentityListWithMultipleElements.stream().reduce(100, Integer::sum));

        // list holding multiple values
        List<Integer> nonZeroIdentityListWithZeroElements = Arrays.asList();
        System.out.println(nonZeroIdentityListWithZeroElements.stream().reduce(100, Integer::sum));
    }
}
