package ru.bstu.iitus.vt41.DD.objects;

import ru.bstu.iitus.vt41.DD.objects.Ball;

import java.util.Scanner;

public class Bascketball extends Ball {

    public Bascketball() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType("Баскетбольный мяч");
    }

    @Override
    public String toString() {
        return "Мяч \nРадиус мяча: " + getRadius() + "\nВид спорта: " + getSportType();
    }
}
