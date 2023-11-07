package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Принят"),
    IN_WORK("В работе"),
    WAITING("Ожидает"),
    FINISHED("Работы завершены");

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
