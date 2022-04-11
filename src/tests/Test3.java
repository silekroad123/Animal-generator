package tests;

import animals.UnitDog;
import enums.TypeOfAnimalFoodEnum;

public class Test3 {

    public static void createAnimal3() {

        UnitDog dog = new UnitDog();
        dog.createDog();
        dog.animalEvolved(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD);
        dog.animalEvolved(TypeOfAnimalFoodEnum.FIGHT_FOOD);
        dog.visualCharacteristics();
    }
}
