package lesson.three.homework;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    Random random = new Random();
    public void createAnimals(int numberOfAnimal){
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
        }
    }

    public void createAnimals(){
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
            count++;
        } while (count < numberOfAnimal);

    }
}
