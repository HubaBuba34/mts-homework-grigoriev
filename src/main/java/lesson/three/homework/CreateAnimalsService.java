package lesson.three.homework;

import lesson.three.homework.Animals.*;
import lesson.three.homework.Animals.Enums.AnimalType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CreateAnimalsService {

    int DEFAULT_ANIMALS_COUNT = 10;

    AnimalsFactory animalsFactory = new AnimalsFactory();
    default List<Animal> create() {
        List<Animal> animals = new ArrayList<>();
        int i = 0;
        while (i < DEFAULT_ANIMALS_COUNT) {
            animals.add(animalsFactory.getRandomAnimal());
            i++;
        }
        System.out.println("\t" + DEFAULT_ANIMALS_COUNT + " animals created by CreateAnimalsService.create()");
        return animals;
    }
}
