package tests;
import animals.*;

public class Test1 {

    public static void createAnimal1() {

        UnitCamel camel = new UnitCamel();
        camel.createCamel();
        camel.visualCharacteristics();
        camel.specialAbilities();

        UnitCock cock = new UnitCock();
        cock.createCock();
        cock.visualCharacteristics();
        cock.specialAbilities();

        UnitCow cow = new UnitCow();
        cow.createCow();
        cow.visualCharacteristics();
        cow.specialAbilities();

        UnitDog dog = new UnitDog();
        dog.createDog();
        dog.visualCharacteristics();
        dog.specialAbilities();

        UnitHorse horse = new UnitHorse();
        horse.createHorse();
        horse.visualCharacteristics();
        horse.specialAbilities();

        UnitSheep sheep = new UnitSheep();
        sheep.createSheep();
        sheep.visualCharacteristics();
        sheep.specialAbilities();

    }
}