package lesson.three.homework;

import lesson.three.homework.service.InvalidAnimalBirthDateException;
import lesson.three.homework.service.InvalidAnimalException;

public interface SearchService {
    default void checkLeapYearAnimal(Animal animal) throws InvalidAnimalBirthDateException{
        if (animal == null){
            throw new InvalidAnimalException();
        } else if (animal.getBirthDate() == null){
            throw new InvalidAnimalBirthDateException(animal.getName());
        } else if (animal.getBirthDate().isLeapYear()){
            System.out.println(animal.getName() + " был рожден в високосный год");
        } else {
            System.out.println(animal.getName() + " не был рожден в високосный год");
        }
    };
}
