package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output output;

    public FindAllAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать все заявки";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        System.out.println("=== Вывод всех заявок ===");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Хранилище еще не содержит заявок");
        return true;
    }
}
