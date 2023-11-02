package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
