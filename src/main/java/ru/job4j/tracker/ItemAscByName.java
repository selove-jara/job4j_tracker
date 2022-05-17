package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item o, Item o1) {
        return o.getName().compareTo(o1.getName());
    }
}
