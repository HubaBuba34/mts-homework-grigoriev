package lesson.three.homework;

import lesson.three.homework.Animals.*;
import lesson.three.homework.Animals.Enums.*;
import lesson.three.homework.util.RandomEnumValue;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class AnimalsFactory {
    public static final int MAX_ANIMAL_AGE_DAYS = 10000;

    public Animal getRandomAnimal() {
        return getRandomAnimal(AnimalType.getRandom());
    }
    public Animal getRandomAnimal(AnimalType animalType){
        if (Objects.isNull(animalType)){
            return null;
        }
        Animal randomAnimal = null;
        Random random = new Random();
        String character = new RandomEnumValue<>(AnimalCharacter.class).getString();
        String name = new RandomEnumValue<>(AnimalName.class).getString();
        LocalDate birthday = LocalDate.now().minusDays(random.nextInt(MAX_ANIMAL_AGE_DAYS));
        double cost = random.nextDouble() * 10000.00;

        switch (animalType){
            case CAT:
                randomAnimal = new Cat(new RandomEnumValue<>(CatBreed.class).getString(), character,
                        name,birthday,cost);
                break;
            case DOG:
                randomAnimal = new Dog(new RandomEnumValue<>(DogBreed.class).getString(), character,
                        name,birthday,cost);
                break;
            case WOLF:
                randomAnimal = new Wolf(new RandomEnumValue<>(WolfBreed.class).getString(), character,
                        name,birthday,cost);
                break;
            case SHARK:
                randomAnimal = new Shark(new RandomEnumValue<>(SharkBreed.class).getString(), character,
                        name,birthday,cost);
                break;
        }
        return randomAnimal;
    }
}
