package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExampleForMax {
    public static void main(String[] args) {

        // Sum (Looks good for all cases)
        // Empty list
        List<Integer> list = Arrays.asList();
        System.out.println(list.stream().reduce(0, Integer::max));

        // list holding multiple values
        List<Integer> nonZeroIdentityListWithMultipleElements = Arrays.asList(-10);
        System.out.println(nonZeroIdentityListWithMultipleElements.stream().reduce(100, Integer::max));

        // list holding multiple values
        List<Integer> nonZeroIdentityListWithZeroElements = Arrays.asList();
        System.out.println(nonZeroIdentityListWithZeroElements.stream().reduce(100, Integer::max));

        // Exception scenarios, which will not work as identity is not considered for Max.
        // list holding one value (this is wrong behaviour, we expect to print -1 as that is max
        // but this returns 0, because the max(first element, identity) and the
        // result will be performed with remaining elements in list
        List<Integer> listWithOneElement = Arrays.asList(-1, -2, -3);
        System.out.println(listWithOneElement.stream().reduce(0, Integer::max));

        List<Integer> listWithNegativeElement = Arrays.asList(-10, -2, -3);
        Optional<Integer> integer = listWithNegativeElement.stream().reduce(Integer::max);
        System.out.println(integer);

        List<Integer> listWithSingleNegativeElement = Arrays.asList(-1);
        Optional<Integer> integer1 = listWithSingleNegativeElement.stream().reduce(Integer::max);
        System.out.println(integer1);

        List<Integer> listWithNoElements = Arrays.asList();
        Optional<Integer> integer2 = listWithNoElements.stream().reduce(Integer::max);
        System.out.println(integer2);
    }
}
