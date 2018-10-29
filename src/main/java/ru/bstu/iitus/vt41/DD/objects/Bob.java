package ru.bstu.iitus.vt41.DD.objects;

import java.util.Scanner;

public class Bob extends Training {

    public Bob() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType("Гиря");
    }

    @Override
    public String toString() {
        return "Гиря \nВес гири: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
