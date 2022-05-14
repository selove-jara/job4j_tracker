package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<SearchTask> list) {
        HashSet<String> numbers = new HashSet<>();
        for (SearchTask number : list) {
            numbers.add(number.getNumder());
        }
        return numbers;
    }
}