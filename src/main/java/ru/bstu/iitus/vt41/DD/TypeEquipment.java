package ru.bstu.iitus.vt41.DD;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeEquipment {
    BASCKETBALL(1, "Баскетбольный мяч"),
    TENNIS(2, "Тенисный мяч"),
    RACKET(3, "Ракетка"),
    BULLET(4, "Ядро"),
    BARBELL(5, "Штанга"),
    BOB(6, "Гиря");

    private int id;
    private String name;

    public static TypeEquipment from(int number) {
        for (TypeEquipment equipmentEnum : TypeEquipment.values()) {
            if (number == equipmentEnum.getId()) {
                return equipmentEnum;
            }
        }
        throw new RuntimeException("Такого не существует: " + number);
    }

    public static String showAllTypeEquipment() {
        String result = "";
        for (TypeEquipment equipmentEnum : TypeEquipment.values()) {
            result += equipmentEnum.id + " - " + equipmentEnum.name + "\n";
        }
        return result;
    }

}
