package ru.bstu.iitus.vt41.DD.objects;

import lombok.Data;

import java.util.Scanner;

@Data
public abstract class SportsEquipment {
    private String sportType;
    private int weight;

    public abstract void init(Scanner scanner);

}
