package ru.bstu.iitus.vt41.DD.objects;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class Training extends SportsEquipment {

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите вес: ");
        super.setWeight(scanner.nextInt());

    }

}
