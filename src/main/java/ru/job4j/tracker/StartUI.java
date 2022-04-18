package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item time = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timeFormat = time.getCreated().format(formatter);
        System.out.println("Текущие дата и время: " + timeFormat);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String timeFormatt = time.getCreated().format(formatter1);
        System.out.println("Текущие дата и время: " + timeFormatt);
    }
}
