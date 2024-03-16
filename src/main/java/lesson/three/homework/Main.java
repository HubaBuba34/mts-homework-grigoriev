package lesson.three.homework;

import lesson.three.homework.service.InvalidAnimalBirthDateException;

public class Main {
    public static void main(String[] agrs) {
        CreateAnimalServiceImpl сreateAnimalServiceImpl = new CreateAnimalServiceImpl();
        try {
            System.out.println("Run createDefaultAnimals");
            сreateAnimalServiceImpl.createDefaultAnimals();
            System.out.println("Run createAnimals");
            сreateAnimalServiceImpl.createAnimals(5);
            System.out.println("Run Overwritten createAnimals");
            сreateAnimalServiceImpl.createAnimals();
        } catch (InvalidAnimalBirthDateException e) {
            System.out.println("Произошла ошибка");
        }
    }
}
