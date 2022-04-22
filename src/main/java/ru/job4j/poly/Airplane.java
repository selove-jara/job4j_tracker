package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.print("Мы полетим на " + getClass().getSimpleName() + ". ");
    }

    @Override
    public void time(int distance) {
        int time = distance / 600;
        System.out.println("Прибудем на место через " + time + " часов.");
    }
}
