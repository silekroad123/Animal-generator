package tests;

import animals.UnitCow;
import enums.TypeOfAnimalFoodEnum;

public class Test2 {

    public static void createAnimal2() {

        UnitCow cow = new UnitCow();
        cow.createCow();
        cow.animalEvolved(TypeOfAnimalFoodEnum.FIGHT_FOOD);
        cow.specialAbilities();
        cow.visualCharacteristics();
    }
}
