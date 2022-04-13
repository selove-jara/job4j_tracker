package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String operation;

    public Surgeon(String name, String surname, String education,
                   int birthday, String qualification, String diagnosis, String operation) {
        super(name, surname, education, birthday, qualification, diagnosis);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
