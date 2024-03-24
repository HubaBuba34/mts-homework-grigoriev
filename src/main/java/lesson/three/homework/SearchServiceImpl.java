package lesson.three.homework;

import lesson.three.homework.Animals.Animal;
import lesson.three.homework.Exceptions.InvalidAnimalBirthdateException;
import lesson.three.homework.Exceptions.InvalidAnimalException;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    @Override
    public void checkLeapYearAnimal(Animal animal) throws InvalidAnimalException, InvalidAnimalBirthdateException {
        if (animal == null) {
            throw new InvalidAnimalException("Incorrect animal has been passed for check at " + LocalDate.now());
        }

        if (animal.getBirthdate() == null) {
            throw new InvalidAnimalBirthdateException(animal.getType() + " passed for check has not birthdate filled");
        }

        System.out.println(animal.getName() + (animal.getBirthdate().isLeapYear() ?
                " was born on a leap year" :
                " was not born on a leap year")
        );
    }
}
