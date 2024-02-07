package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, -6, 8, 10, -3, -1, 0, 15, -35);
        List<Integer> positive = numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
