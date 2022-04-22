package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Мы едем.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("В нашем транспорте " + number + " пассажиров");
    }

    @Override
    public int refuel(int quantity) {
        return quantity * 50;
    }

    @Override
    public void move() {
        System.out.print("Мы поедем на " + getClass().getSimpleName() + ". ");
    }

    @Override
    public void time(int distance) {
        int time = distance / 70;
        System.out.println("Прибудем на место через " + time + " часов.");
    }
}
