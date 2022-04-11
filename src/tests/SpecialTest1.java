package tests;

import animals.UnitHorse;
import enums.ConditionOfTheAnimalEnum;
import enums.TypeOfAnimalFoodEnum;

public class SpecialTest1 {

    public static void createSpecialAnimal1() {

        UnitHorse horse = new UnitHorse();
        horse.createHorse();
        horse.getConditionOfTheAnimal(ConditionOfTheAnimalEnum.SLEEPING);
        horse.animalEvolved(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD);
    }
}