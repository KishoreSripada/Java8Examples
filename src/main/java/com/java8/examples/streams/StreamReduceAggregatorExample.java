package com.java8.examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReduceAggregatorExample {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4);

        // Type 1 - Having Identity as first parameter will return exact Object (Integer in this case)
        Integer sum = listOfNumbers.stream().reduce(0, (x, y) -> x+y);
        System.out.println(sum);

        // Type 1 - Having Identity as first parameter will return exact Object (Integer in this case)
        BinaryOperator<Integer> binaryOperator = (x, y) -> x+y;
        Optional<Integer> sum1 = listOfNumbers.stream().reduce(binaryOperator);
        System.out.println(sum1);

        Stream<Integer> emptyStream = Stream.empty();
        Optional<Integer> sum2 = emptyStream.reduce(binaryOperator);
        System.out.println(sum2);

        List<Integer> listOfSingleNumber = Arrays.asList(50);
        Optional<Integer> sum3 = listOfSingleNumber.stream().reduce(binaryOperator);
        System.out.println(sum3);

        // Using Method Reference
        Integer sum4 = listOfNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum4);
    }
}