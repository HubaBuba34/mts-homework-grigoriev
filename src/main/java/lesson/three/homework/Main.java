package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import lesson.three.homework.Exceptions.InvalidAnimalException;
import lesson.three.homework.Exceptions.InvalidAnimalBirthdateException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        CreateAnimalsServiceImpl createAnimalsServiceImpl = new CreateAnimalsServiceImpl();
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();

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
    }
}