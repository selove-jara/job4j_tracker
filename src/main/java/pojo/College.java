package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Морозов Андрей Юрьевич");
        student.setGroup(12);
        student.setData(new Date());
        System.out.println(student.getSurname() + " находится в группе " + student.getGroup() + "  и дата поступления:" + student.getData());
    }
}
