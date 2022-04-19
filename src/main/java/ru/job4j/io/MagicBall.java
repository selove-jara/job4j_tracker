package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer <= 1) {
            if (answer == 0) {
                System.out.println(question + System.lineSeparator() + "Да");
            } else {
                System.out.println(question + System.lineSeparator() + "Нет");
            }
        } else {
            System.out.println(question + System.lineSeparator() + "Может быть");
        }
    }
}
