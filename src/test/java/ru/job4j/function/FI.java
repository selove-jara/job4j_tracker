package ru.job4j.function;

import ru.job4j.lambda.Attachment;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(atts, comparator);
        for (Attachment att : atts) {
            System.out.println(att);

            Comparator<String> cmpText = (left, right) -> left.compareTo(right);

            Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());
        }
    }
}
