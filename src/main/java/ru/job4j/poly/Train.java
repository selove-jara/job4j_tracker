package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print("Мы будем путешестовать на " + getClass().getSimpleName() + ". ");
    }

    @Override
    public void time(int distance) {
        int time = distance / 90;
        System.out.println("Прибудем на место через " + time + " часов.");
    }
}
