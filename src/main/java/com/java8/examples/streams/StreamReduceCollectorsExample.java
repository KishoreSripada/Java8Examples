package com.java8.examples.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamReduceCollectorsExample {
    public static void main(String[] args) {

        // Problem Statement - Print all the person names whose age is > 20
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("f",34));
        personList.add(new Person("e",94));
        personList.add(new Person("d",44));
        personList.add(new Person("c",15));
        personList.add(new Person("b",44));
        personList.add(new Person("a",3));

        String result =
        personList
           .stream()
           .filter(p -> p.getAge()>20)
           .map(Person::getName)
           .collect(Collectors.joining(","));
        System.out.println(result);

        // Problem Statement - Print all the person names whose age is > 20
        List<Person> result1 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>20)
                        .collect(Collectors.toList());
        result1.forEach(System.out::println);

        List<String> result2 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>20)
                        .map(Person::getName)
                        .collect(Collectors.toList());
        result2.forEach(System.out::println);

        // use map
        Map<Integer, List<Person>> resultMap =
                personList
                        .stream()
                        .filter(p -> p.getAge()>0)
                        .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(resultMap);

        Map<Integer, Long> resultMap1 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>0)
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.counting()));
        System.out.println(resultMap1);


        Map<Integer, List<String>> resultMap2 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>40)
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName,
                                        Collectors.toList())));
        System.out.println(resultMap2);

        // Sorting the names while returning
        Map<Integer, Set<String>> resultMap3 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>40)
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName,
                                        Collectors.toCollection(TreeSet::new))));
        System.out.println(resultMap3);

        Map<Integer, String> resultMap4 =
                personList
                        .stream()
                        .filter(p -> p.getAge()>40)
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName,
                                        Collectors.joining(","))));
        System.out.println(resultMap4);
    }
}
