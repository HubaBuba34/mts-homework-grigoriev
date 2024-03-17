package lesson.three.homework.service;

public class InvalidAnimalBirthDateException extends Exception {
    public InvalidAnimalBirthDateException(String animalType){
        super("У животного " + animalType + " не указана дата его рождения");
    }
}
