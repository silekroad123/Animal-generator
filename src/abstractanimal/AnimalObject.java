package abstractanimal;

import animals.*;

public abstract class AnimalObject {

    public abstract String animalType();
    public abstract String soundType();
    public abstract void specialAbilities();
    public abstract void visualCharacteristics();
    public abstract void resetCharacteristics();

    public void createCamel(){new UnitCamel();}
    public void createCock(){ new UnitCock();}
    public void createCow(){new UnitCow();}
    public void createDog(){new UnitDog();}
    public void createHorse(){new UnitHorse();}
    public void createSheep(){new UnitSheep();}

}
