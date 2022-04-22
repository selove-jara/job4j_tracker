package ru.job4j.poly;

public class Implement {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle air = new Airplane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, air, train};
        for (Vehicle a : vehicles) {
            a.move();
            a.time(1260);
            System.out.println();
        }
    }
}
