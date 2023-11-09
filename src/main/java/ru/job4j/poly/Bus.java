package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengers(int count) {
        count = 50;
        System.out.println("В автобусе 50 пассажиров");
    }

    @Override
    public double fuel(double volume) {
        volume = 100;
        double price = 65.35;
        System.out.print("Необходимо заправить " + volume + " литров топлива на сумму: ");
        return volume * price;
    }
}
