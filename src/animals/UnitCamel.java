package animals;

import abstractanimal.Unit;
import enums.TypeOfAnimalFoodEnum;

public class UnitCamel extends Unit {

    public String animalType() {

        if(this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)){
            return "Плюеща камила";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)){
            return "Двугърба камила";
        } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)){
            return "Вкусна камила";
        }else{
            return "Камила";
        }
    }

    @Override
    public String soundType() {
        return "Тук нямам идея какъв е звука :D!";
    }
}
