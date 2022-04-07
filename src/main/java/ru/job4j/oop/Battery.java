package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load ;
        this.load = 0;
    }

    public int getLoad() {
        return load;
    }

    public static void main(String[] args) {
        Battery charger = new Battery(47);
        Battery another = new Battery(23);
        System.out.println("charger : " + charger.load + ". another : " + another.load);
        charger.exchange(another);
        System.out.println("charger : " + charger.load + ". another : " + another.load);

    }
}
