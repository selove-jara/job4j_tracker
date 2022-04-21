package ru.job4j.poly;

public class Bus implements Transport {
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
}
