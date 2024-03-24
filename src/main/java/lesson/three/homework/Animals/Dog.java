package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalCharacter;
import lesson.three.homework.Animals.Enums.AnimalName;
import lesson.three.homework.Animals.Enums.AnimalType;
import lesson.three.homework.Animals.Enums.DogBreed;
import lesson.three.homework.util.RandomEnumValue;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends Pet {
    private static final AnimalType TYPE = AnimalType.DOG;

    public Dog() {
        super(TYPE, new RandomEnumValue<>(DogBreed.class).getString(),
                new RandomEnumValue<>(AnimalCharacter.class).getString(),
                new RandomEnumValue<>(AnimalName.class).getString(),
                new Random().nextDouble() * new Random().nextInt(Pet.COST_BOUND),
                LocalDate.now().minusDays(new Random().nextInt(AbstractAnimal.BIRTHDATE_DAYS_BOUND))
        );
    }

    @SuppressWarnings("unused")
    public Dog(String breed, String character, String name, LocalDate birthdate, double cost) {
        super(TYPE, breed, character, name, cost, birthdate);
    }
}
