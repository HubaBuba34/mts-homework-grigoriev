package lesson.three.homework;

import java.time.LocalDate;

public class Pet extends AbstractAnimal{

    public Pet(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCharacter() {
        return character;
    }

    public LocalDate getBirthDate(){ return birthDate; }
}
