package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task number : list) {
            numbers.add(String.valueOf(number.getNumber()));
        }
        return numbers;
    }
}