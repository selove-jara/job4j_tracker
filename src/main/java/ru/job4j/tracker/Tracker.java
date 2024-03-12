package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        int index = 0;
        for (Item item : items) {
            if (item.getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item != null) {
                result = items;
            }
        }
        return result;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                result.add(item);
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items.get(index).getId());
            items.set(index, item);
            result = true;
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            result = true;
        }
        return result;
    }
}
