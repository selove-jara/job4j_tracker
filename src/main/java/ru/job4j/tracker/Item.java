package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Имя предмета: " + name);
        System.out.println("Номер предмета: " + id);
        System.out.println();
    }

    public static void main(String[] args) {
        Item first = new Item("GeForce RTX 3090 GamingPro");
        Item atom = new Item(4715084, "GeForce RTX 3090 GamingPro");
        first.printInfo();
        atom.printInfo();
    }
}