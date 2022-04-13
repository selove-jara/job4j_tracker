package ru.job4j.inheritance;

public class Builder extends Engineer {

     private int direction;

     public Builder(String name, String surname, String education, int birthday, String specialization, int direction) {
          super(name, surname, education, birthday, specialization);
          this.direction = direction;
     }

     public int getDirection() {
          return direction;
     }
}
