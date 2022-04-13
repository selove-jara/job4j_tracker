package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String treatment;

    public Dentist(String name, String surname, String education,
                   int birthday, String qualification, String diagnosis, String treatment) {
        super(name, surname, education, birthday, qualification, diagnosis);
        this.treatment = treatment;
    }

    public String getTreatment() {
        return treatment;
    }
}
