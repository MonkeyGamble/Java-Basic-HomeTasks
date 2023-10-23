package de.telran.summary;

import java.util.Random;

public class AutoParking {
    public static void main(String[] args) {

        Random random = new Random();

        boolean noPigeonsOnRoad = random.nextBoolean();
        System.out.println("Дороги сейчас не заняты голубями = " +noPigeonsOnRoad);
        boolean isRoadClear = random.nextBoolean();
        System.out.println("Дороги чистые от снега = "+ isRoadClear);
        boolean isOwner = random.nextBoolean();
        System.out.println("За рулём автомобиля сидит владелец = " +isOwner);
        boolean isEvacuator = random.nextBoolean();
        System.out.println("Aвтомобиль вывозит эвакуатор = " +isEvacuator);
        boolean isNotEmpty = random.nextBoolean();
        System.out.println("Бензобак автомобиля не пуст = " +isNotEmpty);
        boolean isDriverOldEnough = random.nextBoolean();
        System.out.println("Водитель старше 18 лет = " + isDriverOldEnough);

        System.out.println();

        if (noPigeonsOnRoad && isRoadClear && ((isOwner && isNotEmpty && isDriverOldEnough) ^ isEvacuator))
            System.out.println("Машина может выехать с парковки!");
        else
            System.out.println("Машина не может выехать с парковки");
    }

}

/*
Вы решили создать приложение для управления автомобилями на вашей автопарковке.
Для этого вам необходимо определить, сможет ли автомобиль выехать с парковки в определенные условия.
Напишите логическое выражение, которое будет определять, сможет ли автомобиль выехать с парковки или нет.
Условия:
Дороги сейчас не заняты голубями (noPigeonsOnRoad).
Дороги чистые от снега (isRoadClear).
За рулём автомобиля сидит владелец (isOwner) или автомобиль вывозит эвакуатор (isEvacuator). Во время эвакуации водитель не может сидеть за рулём.
Если за рулём владелец, то
Бензобак автомобиля не пуст (isNotEmpty).
Водитель старше 18 лет (isDriverOldEnough).
Определите начальные значения переменных так, чтобы автомобиль смог выехать с парковки.
 */