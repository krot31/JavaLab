package ru.bstu.iitus.vt41.DD.objects;

import lombok.Data;

import java.util.Scanner;

@Data
public class Bullet extends SportsEquipment {

    public Bullet() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес: ");
        super.setWeight(scanner.nextInt());
        super.setSportType("Ядро");
    }

    @Override
    public String toString() {
        return "Ядро \nВес: " + getWeight() + "\nВид спорта: " + getSportType();
    }


}
