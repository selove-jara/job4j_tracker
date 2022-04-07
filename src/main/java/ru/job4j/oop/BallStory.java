package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare oblique = new Hare();
        Wolf grey = new Wolf();
        Fox sly = new Fox();
        oblique.tryEat(kolobok);
        grey.tryEat(kolobok);
        sly.tryEat(kolobok);
    }
}
