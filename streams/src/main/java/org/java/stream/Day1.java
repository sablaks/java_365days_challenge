package org.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day1 {


    public static void main(String[] args) {
        /*
        convert array to stream and every element in array should be multiplied by 2
         */
         convertArrayToStream();
         convertObjectArrayToStream();
         convertListToStream();
    }

    private static void convertObjectArrayToStream() {
        /*
        Input: String[] words = {"java", "stream", "api"};
        Goal: Convert to Stream<String>, print uppercase.
        Output: JAVA  STREAM  API
         */
        Stream<String> objectStream = Stream.of("java", "stream", "api");
        objectStream.map(a -> a.toUpperCase()).forEach(System.out::println);
    }

    static void convertArrayToStream() {
         int[] primitiveArray = {1,2,3,4};
         Integer[] objectArray = {1,2,3,4};

        IntStream primitiveIntStream = Arrays.stream(primitiveArray);
         primitiveIntStream.map(n -> n*2).forEach(System.out::println);
        Stream<Integer> objectIntStream = Stream.of(objectArray);
        objectIntStream.forEach(System.out::println);

    }

    static void convertListToStream() {
        /*
        Input: List<Double> numbers = Arrays.asList(1.5, 2.5, 3.5);
        Goal: Convert to stream, square each, collect to list.
        Output: [2.25, 6.25, 12.25]
         */
        List<Double> numbers = Arrays.asList(1.5, 2.5, 3.5);
        numbers.stream().map(num -> num*num).forEach(System.out::println);

    }
}
