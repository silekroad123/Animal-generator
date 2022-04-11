package abstractanimal;
import enums.ConditionOfTheAnimalEnum;
import enums.TypeOfAnimalFoodEnum;
import utility.Terminal;

public abstract class Unit extends AnimalObject {

    protected int weight;
    protected int aggression;
    protected int speed;
    protected int energy;

    protected int evolvedUnit;
    protected int activateUnit;
    protected boolean isAnimalEvolved;
    protected TypeOfAnimalFoodEnum typeOfAnimal;
    protected ConditionOfTheAnimalEnum conditionOfTheAnimal;

    public Unit() {

        this.typeOfAnimal         = TypeOfAnimalFoodEnum.NONE;
        this.conditionOfTheAnimal = ConditionOfTheAnimalEnum.AWAKE;

        this.weight     = Terminal.generateRandomNumber();
        this.aggression = Terminal.generateRandomNumber();
        this.speed      = Terminal.generateRandomNumber();
        this.energy     = Terminal.generateRandomNumber();

    }

    public void setWeight(int weight) {

        if (weight != 0) {
            this.weight = weight;
        }
        this.conditionOfTheAnimal = ConditionOfTheAnimalEnum.SLEEPING;
    }

    public int getWeight() {

        return this.weight;
    }

    public void setAggression(int aggression) {

        if (aggression != 0) {
            this.aggression = aggression;
        }
        this.conditionOfTheAnimal = ConditionOfTheAnimalEnum.SLEEPING;
    }

    public int getAggression() {

        return this.aggression;
    }

    public void setSpeed(int speed) {

        if (speed != 0) {
            this.speed = speed;
        }
        this.conditionOfTheAnimal = ConditionOfTheAnimalEnum.SLEEPING;
    }

    public int getSpeed() {

        return this.speed;
    }


    public void setEnergy(int energy) {

        if (energy != 0) {
            this.energy = energy;
        }
        this.conditionOfTheAnimal = ConditionOfTheAnimalEnum.SLEEPING;
    }

    public int getEnergy() {

        return this.energy;
    }

    public String getConditionOfTheAnimal(ConditionOfTheAnimalEnum conditionOfTheAnimal) {

        return String.valueOf(conditionOfTheAnimal);
    }

    public TypeOfAnimalFoodEnum getTypeOfAnimal() {

        return this.typeOfAnimal;
    }


    public void animalEvolved(TypeOfAnimalFoodEnum foodType) {

        if (this.evolvedUnit >= 3 && !this.isAnimalEvolved) {

            this.typeOfAnimal = foodType;
            this.isAnimalEvolved = true;
            this.evolvedUnit++;
        }
    }

    @Override
    public void specialAbilities() {

        if (this.activateUnit > 3) {

            this.setWeight(0);
            this.setSpeed(0);
            this.setEnergy(0);
            this.setAggression(0);

        } else {

            this.activateUnit++;
            this.soundType();

            if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.FIGHT_FOOD)) {
                this.aggression++;
            } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.TRANSPORT_FOOD)) {
                this.speed += this.speed / 2;
            } else if (this.getTypeOfAnimal().equals(TypeOfAnimalFoodEnum.NUTRITIOUS_FOOD)) {
                this.weight *= 0.1 + this.weight;
            }
        }
    }

    public void visualCharacteristics() {
        System.out.println("Животно = " + this.animalType());
        System.out.println("Звук    = " + this.soundType());
        System.out.println("Тегло   = " + this.getWeight());
        System.out.println("Агресия = " + this.getAggression());
        System.out.println("Скорост = " + this.getSpeed());
        System.out.println("Енергия = " + this.getEnergy());
        System.out.println();
    }

    public void resetCharacteristics() {

        this.setWeight(0);
        this.setSpeed(0);
        this.setEnergy(0);
        this.setAggression(0);
    }
}