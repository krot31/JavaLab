package ru.bstu.iitus.vt41.DD;

import ru.bstu.iitus.vt41.DD.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

import static ru.bstu.iitus.vt41.DD.TypeEquipment.showAllTypeEquipment;

public class Application {

    public static SportsEquipment createEquipment(TypeEquipment typeEqiupment) {

        SportsEquipment equipment = null;

        switch (typeEqiupment) {
            case BASCKETBALL:
                equipment = new Bascketball();
                break;
            case TENNIS:
                equipment = new Tennis();
                break;
            case RACKET:
                equipment = new Racket();
                break;
            case BULLET:
                equipment = new Bullet();
                break;
            case BARBELL:
                equipment = new Barbell();
                break;
            case BOB:
                equipment = new Bob();
        }
        return equipment;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество спортивного инвентаря: ");
        int size = scanner.nextInt();
        List<SportsEquipment> equipments = new ArrayList<>();

        int type;

        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Выберите тип спортивного инвентаря\n" + showAllTypeEquipment());
                type = scanner.nextInt();
            } while (type < 1 || type > TypeEquipment.values().length);

            equipments.add(createEquipment(TypeEquipment.from(type)));
        }


        System.out.println("-------Основная хар-ка - вес-------");

        for (int i = 0; i < size; i++) {
            if(equipments.get(i).getWeight()>0){
                System.out.print(equipments.get(i).getSportType() + '-');
                System.out.println(equipments.get(i).getWeight()+ "kg");
            }
        }

    }
}
