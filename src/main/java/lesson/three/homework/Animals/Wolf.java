package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalCharacter;
import lesson.three.homework.Animals.Enums.AnimalName;
import lesson.three.homework.Animals.Enums.AnimalType;
import lesson.three.homework.Animals.Enums.WolfBreed;
import lesson.three.homework.util.RandomEnumValue;

import java.time.LocalDate;
import java.util.Random;

public class Wolf extends Predator {
    private static final AnimalType TYPE = AnimalType.WOLF;

    public Wolf() {
        super(TYPE, new RandomEnumValue<>(WolfBreed.class).getString(),
                new RandomEnumValue<>(AnimalCharacter.class).getString(),
                new RandomEnumValue<>(AnimalName.class).getString(),
                LocalDate.now().minusDays(new Random().nextInt(AbstractAnimal.BIRTHDATE_DAYS_BOUND)),
                new Random().nextDouble() * new Random().nextInt(Pet.COST_BOUND)
        );
    }

    @SuppressWarnings("unused")
    public Wolf(String breed, String character, String name, LocalDate birthdate, double cost) {
        super(TYPE, breed, character, name, birthdate, cost);
    }
}
