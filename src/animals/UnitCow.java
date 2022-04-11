package animals;

import abstractanimal.Unit;
import enums.TypeOfAnimalFoodEnum;

public class UnitCow extends Unit {

    @Override
    public String animalType() {

        if(this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)){
            return "Рогата крава";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)){
            return "Транспортна крава";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)){
            return "Млекодайна крава";
        }else{
            return "Крава";
        }
    }

    @Override
    public String soundType() {
        return "Муу!";
    }

}