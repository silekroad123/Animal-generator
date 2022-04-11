package animals;

import abstractanimal.Unit;
import enums.TypeOfAnimalFoodEnum;

public class UnitHorse extends Unit {

    @Override
    public String animalType() {

        if(this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)){
            return "Боен кон";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)){
            return "Кон Вихрогон";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)){
            return "Дебел кон";
        }else{
            return "Кон";
        }
    }

    @Override
    public String soundType() {
        return "Тъгъдък!";
    }
}
