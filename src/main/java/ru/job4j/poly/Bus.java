package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет по дороге.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("В автобусе " + number + " пассажиров.");
    }

    @Override
    public double refuel(double fuel) {
        double price = 55.48;
        return price * fuel;
    }
}
