package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class Lambda_MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Legacy/Traditional way
        /*for ( int i =0 ; i<list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        // For Each
        /*for( int value : list ) {
            System.out.println(value);
        }*/

        // Anonymous class
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        // Method Interface
        //list.forEach(System.out::println);
    }
}