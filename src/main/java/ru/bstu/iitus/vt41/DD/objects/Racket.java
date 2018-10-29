package ru.bstu.iitus.vt41.DD.objects;

import lombok.Data;

import java.util.Scanner;

@Data
public class Racket extends SportsEquipment {

    private int diameter;


    public Racket() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите диаметр рукоятки: ");
        setDiameter(scanner.nextInt());
        super.setSportType("Ракетка");
    }

    @Override
    public String toString() {
        return "Ракетка \nДиаметр рукоятки: " + getDiameter() + "\nВид спорта: " + getSportType();
    }
}
