package ru.job4j.collection;

public class SearchTask {
    private String number;
    private String description;

    public SearchTask(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumder() {
        return number;
    }
}
