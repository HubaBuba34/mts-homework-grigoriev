package lesson.three.homework;

import lesson.three.homework.Animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateAnimalsServiceImpl implements CreateAnimalsService {
    AnimalsFactory animalsFactory = new AnimalsFactory();
    @Override
    public List<Animal> create() {
        List<Animal> animals = new ArrayList<>();
        int i = 0;
        do {
            animals.add(animalsFactory.getRandomAnimal());
            i++;
        } while (i < DEFAULT_ANIMALS_COUNT);

        System.out.println("\t" + DEFAULT_ANIMALS_COUNT + " animals created by CreateAnimalsServiceImpl.create()");
        return animals;
    }

    public List<Animal> create(int n) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(animalsFactory.getRandomAnimal());
        }

        System.out.println("\t" + n + " animals created by CreateAnimalsServiceImpl.create(" + n + ")");
        return animals;
    }
}
