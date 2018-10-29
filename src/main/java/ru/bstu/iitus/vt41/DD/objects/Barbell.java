package ru.bstu.iitus.vt41.DD.objects;

import java.util.Scanner;

public class Barbell extends Training {

    public Barbell() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        super.setSportType("Штанга");
    }

    @Override
    public String toString() {
        return "Штанга \nВес штанги: " + getWeight() + "\nВид спорта: " + getSportType();
    }
}
