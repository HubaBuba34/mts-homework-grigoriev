package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalCharacter;
import lesson.three.homework.Animals.Enums.AnimalName;
import lesson.three.homework.Animals.Enums.AnimalType;
import lesson.three.homework.Animals.Enums.CatBreed;
import lesson.three.homework.util.RandomEnumValue;

import java.time.LocalDate;
import java.util.Random;

/**
 * Кошка.
 */
public class Cat extends Pet {
    private static final AnimalType TYPE = AnimalType.CAT;

    public Cat() {
        super(TYPE, new RandomEnumValue<>(CatBreed.class).getString(),
                new RandomEnumValue<>(AnimalCharacter.class).getString(),
                new RandomEnumValue<>(AnimalName.class).getString(),
                new Random().nextDouble() * new Random().nextInt(Pet.COST_BOUND),
                LocalDate.now().minusDays(new Random().nextInt(AbstractAnimal.BIRTHDATE_DAYS_BOUND))
        );
    }

    @SuppressWarnings("unused")
    public Cat(String breed, String character, String name, LocalDate birthdate, double cost) {
        super(TYPE, breed, character, name,cost, birthdate);
    }
}
