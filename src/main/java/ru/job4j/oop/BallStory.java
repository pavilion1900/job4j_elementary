package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball bun = new Ball();
        Hare rabbit = new Hare();
        Wolf gosha = new Wolf();
        Fox alisa = new Fox();
        rabbit.tryEat(bun);
        gosha.tryEat(bun);
        alisa.tryEat(bun);
    }
}