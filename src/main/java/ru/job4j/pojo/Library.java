package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book guide = new Book("Java. Полное руководство", 689);
        Book library = new Book("Java. Библиотека профессионала", 867);
        Book studying = new Book("Изучаем Java", 489);
        Book clean = new Book("Clean code", 894);
        Book[] books = new Book[4];
        books[0] = guide;
        books[1] = library;
        books[2] = studying;
        books[3] = clean;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Название книги: " + book.getName()
                    + " - " + book.getPage() + " страниц. ");
        }
        System.out.println("Топ книг изменился: ");
        books[0] = clean;
        books[3] = guide;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Название книги: " + book.getName()
                    + " - " + book.getPage() + " страниц. ");
        }
        System.out.println("Поиск книги: ");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.equals(clean));
        }
    }
}
