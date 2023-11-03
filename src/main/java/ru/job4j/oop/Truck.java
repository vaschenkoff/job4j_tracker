package ru.job4j.oop;

public class Truck extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }
}
