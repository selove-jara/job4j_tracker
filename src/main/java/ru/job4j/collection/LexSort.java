package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] a = left.split("\\.");
        String[] b = right.split("\\.");
        int leftA = Integer.parseInt(a[0]);
        int rightB = Integer.parseInt(b[0]);
        return Integer.compare(leftA, rightB);
    }
}