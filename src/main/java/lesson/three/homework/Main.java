package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import lesson.three.homework.Exceptions.InvalidAnimalException;
import lesson.three.homework.Exceptions.InvalidAnimalBirthdateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        CreateAnimalsServiceImpl createAnimalsServiceImpl = new CreateAnimalsServiceImpl();
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        /*
        List<Animal> animals = createAnimalsServiceImpl.create();
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.print("\t");
            try {
                searchServiceImpl.checkLeapYearAnimal(animal);
            } catch (InvalidAnimalBirthdateException e) {
                throw new InvalidAnimalException("Can not check if animal was born in a leap year\n\t" +
                        e.getMessage());
            }

        }
        Map<String, List<Animal>> animalsMap = createAnimalsServiceImpl.creteMap(5);
        System.out.println("\tanimalsMap: animals created by CreateAnimalsServiceImpl.createMap");
        System.out.println(animalsMap + "\n");*/
        List<Animal> animals = createAnimalsServiceImpl.create(10);
        System.out.println("createAnimal");
        System.out.println(animals + "\n");
        AnimalsRepositoryImpl animalsRepository = new AnimalsRepositoryImpl();
        System.out.println("findLeapYearNames");
        System.out.println(animalsRepository.findOlderAnimals(animals,15) + "\n");
        System.out.println("findOlderAnimals");
        System.out.println(animalsRepository.findLeapYearNames(animals) + "\n");
        System.out.println("findAllDuplicates");
        System.out.println(animalsRepository.findAllDuplicates(animals) + "\n");
    }
}