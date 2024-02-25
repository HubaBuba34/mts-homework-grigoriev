package lesson.three.homework;

import java.util.Random;

public interface CreateAnimalService {
    Random random = new Random();
     default void createDefaultAnimals(){
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
            System.out.println("Created Animal: " + animal.getName() + ", " + animal.getBreed() +
                    ", " + animal.getCost() + ", " + animal.getCharacter());
           count++;
        }
    }
}
