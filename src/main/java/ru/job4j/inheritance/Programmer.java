package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String programmingLanguage;

    private int workExperience;

    public Programmer(String name, String surname, String education, int birthday, String specialization, String programmingLanguage, int workExperience) {
        super(name, surname, education, birthday, specialization);
        this.programmingLanguage = programmingLanguage;
        this.workExperience = workExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
