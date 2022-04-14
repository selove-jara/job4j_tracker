package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Morozov ");
        student.setName("Andrey ");
        student.setPatronymic("Yurievich ");
        student.setGroup(" DTETB-51 ");
        student.setReceipts(" 9 august 2016 ");
        System.out.println(student.getSurname() + student.getName()
                + student.getPatronymic() + "enrolled college"
                + student.getReceipts() + "group" + student.getGroup());
    }
}
