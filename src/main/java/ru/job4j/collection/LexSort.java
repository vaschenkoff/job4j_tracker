package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] dataLeft = left.split("\\.");
        String[] dataRight = right.split("\\.");
        return Integer.compare(Integer.parseInt(dataLeft[0]), Integer.parseInt(dataRight[0]));
    }
}
