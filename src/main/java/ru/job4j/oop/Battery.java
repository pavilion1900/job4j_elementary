package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(1200);
        Battery second = new Battery(1000);
        System.out.println("first battery: " + first.load + ", second battery: " + second.load);
        first.exchange(second);
        System.out.println("first battery: " + first.load + ", second battery: " + second.load);
    }
}
