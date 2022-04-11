package animals;

import abstractanimal.Unit;
import enums.TypeOfAnimalFoodEnum;

public class UnitCock extends Unit {

    @Override
    public String animalType() {

        if(this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)){
            return "Боен петел";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)){
            return "Щраус";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)){
            return "Печен петел";
        }else{
            return "Петел";
        }
    }

    @Override
    public String soundType() {
        return "Кукуригу!";
    }
}
