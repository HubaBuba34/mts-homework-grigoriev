package lesson.three.homework;

import java.time.LocalDate;
import java.util.Date;

public abstract class AbstractAnimal implements Animal {
    protected String breed; //порода
    protected String name; // имя
    protected Double cost; //цена в магазине
    protected String character; // характер
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }
    public String getBreed(){
        return breed;
    }
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public String getCharacter(){
        return character;
    }
    public LocalDate getBirthDate(){ return birthDate; }
    @Override
    public String toString(){
        return "Created Animal: " +
                name + ", " + breed +
                ", " + cost + ", " + character +
                ", " + birthDate;

    }
}

