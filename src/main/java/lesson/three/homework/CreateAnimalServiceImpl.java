package lesson.three.homework;

import lesson.three.homework.service.InvalidAnimalBirthDateException;
import lesson.three.homework.service.InvalidAnimalException;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService, SearchService {
    Random random = new Random();
    @Override
    public void createDefaultAnimals() throws InvalidAnimalBirthDateException{
        int count = 0;
        while (count < 10) {
            Animal animal = new Cat();
            switch (random.nextInt(4)) {
                case 1:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 3:
                    animal = new Dog();
                    break;
                case 4:
                    animal = new Cat();
                    break;
            }
            System.out.println(animal);
            checkLeapYearAnimal(animal);
            count++;
        }
    }
    public void createAnimals(int numberOfAnimal) throws InvalidAnimalBirthDateException{
        for (int i = 0; i < numberOfAnimal; i++){
            Animal animal = new Cat();
            switch (random.nextInt(4)) {
                case 1:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 3:
                    animal = new Dog();
                    break;
                case 4:
                    animal = new Cat();
                    break;
            }
            System.out.println(animal);
            checkLeapYearAnimal(animal);
        }
    }

    public void createAnimals() throws InvalidAnimalBirthDateException {
        int numberOfAnimal = 5;
        int count = 0;
        do {
            Animal animal = new Cat();
            switch (random.nextInt(4)) {
                case 1:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 3:
                    animal = new Dog();
                    break;
                case 4:
                    animal = new Cat();
                    break;
            }
            System.out.println(animal);
            checkLeapYearAnimal(animal);
            count++;
        } while (count < numberOfAnimal);

    }
}
