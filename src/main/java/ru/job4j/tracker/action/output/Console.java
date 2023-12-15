package ru.job4j.tracker.action.output;

public class Console implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
