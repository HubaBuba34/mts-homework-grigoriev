package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface AnimalsRepository {
    Map<String, List<LocalDate>> findLeapYearNames(List<Animal> animals);

    Map<Animal, Integer> findOlderAnimals(List<Animal> animals, int ageYearsBound);

    Map<String, Integer> findAllDuplicates(List<Animal> animals);
}
