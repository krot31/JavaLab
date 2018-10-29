package ru.bstu.iitus.vt41.DD;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  EquipmentWeight {
    WEIGHT(1, "");

    private int id;
    private String name;

    public static EquipmentWeight from(int number) {
        for(EquipmentWeight ballEnum : EquipmentWeight.values()) {
            if (number == ballEnum.getId()) {
                return ballEnum;
            }
        }
        throw new RuntimeException("type do not exist with this number: " + number);
    }

    public static String showAllTypeSportBallEnum() {
        String result = "";
        for(EquipmentWeight sportBallEnum : EquipmentWeight.values()) {
            result += sportBallEnum.id + " - " + sportBallEnum.getName() + "\n";
        }
        return result;
    }
}
