package lesson.three.homework.Animals.Enums;

import java.util.Random;

public enum AnimalType {
    WOLF("Wolf"), SHARK("Shark"), DOG("Dog"), CAT("Cat");

    private final String printable;

    AnimalType(String printable) {
        this.printable = printable;
    }

    private static final Random random = new Random();
    private static final AnimalType[] animalTypes = values();

    @Override
    public String toString() {
        return this.printable;
    }

    public static AnimalType getRandom() {
        return animalTypes[random.nextInt(animalTypes.length)];
    }
}
