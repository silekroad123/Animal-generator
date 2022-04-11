package animals;

import abstractanimal.Unit;
import enums.TypeOfAnimalFoodEnum;

public class UnitSheep extends Unit {

    @Override
    public String animalType() {

        if(this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)){
            return "Бойна овца";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)){
            return "Бърза овца";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)){
            return "Млекодайна овца";
        }else{
            return "Овца";
        }
    }

    @Override
    public String soundType() {
        return "Беее!";
    }
}
