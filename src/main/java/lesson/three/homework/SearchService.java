package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import lesson.three.homework.Exceptions.InvalidAnimalException;
import lesson.three.homework.Exceptions.InvalidAnimalBirthdateException;
public interface SearchService {
    void checkLeapYearAnimal(Animal animal) throws InvalidAnimalException, InvalidAnimalBirthdateException;
}
