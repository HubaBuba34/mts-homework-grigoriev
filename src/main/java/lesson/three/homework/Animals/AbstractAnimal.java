package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalType;

import java.time.LocalDate;


public abstract class AbstractAnimal implements Animal {
    protected AnimalType type;
    protected String breed;
    protected String character;
    protected String name;
    protected double cost;
    protected LocalDate birthdate;
    protected String birthdateFormat = BIRTHDATE_FORMAT_DEFAULT;

    protected static final int BIRTHDATE_DAYS_BOUND = 10000;

    protected static final String BIRTHDATE_FORMAT_DEFAULT = "dd-MM-yyyy";

    public AbstractAnimal(AnimalType type, String breed, String character, String name, double cost, LocalDate birthdate) {
        this.type = type;
        this.breed = breed;
        this.character = character;
        this.name = name;
        this.cost = cost;
        this.birthdate = birthdate;
    }
}
