package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalType;

import java.time.LocalDate;


public interface Animal {

    AnimalType getType();
    String getBreed();
    String getCharacter();
    String getName();
    double getCost();
    LocalDate getBirthdate();
    String getBirthdateFormat();
    @SuppressWarnings("unused")
    void setBirthdateFormat(String format);
    String getBirthdateFormatted();
}
