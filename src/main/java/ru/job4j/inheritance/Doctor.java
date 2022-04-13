package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String qualification;
    private String diagnosis;

    public Doctor(String name, String surname, String education,
                  int birthday, String qualification, String diagnosis) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
        this.diagnosis = diagnosis;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
