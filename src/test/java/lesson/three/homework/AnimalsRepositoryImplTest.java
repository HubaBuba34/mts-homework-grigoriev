package lesson.three.homework;


import lesson.three.homework.Animals.*;
import lesson.three.homework.Animals.Enums.*;
import lesson.three.homework.Animals.Shark;
import lesson.three.homework.Animals.Wolf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class AnimalsRepositoryImplTest {
    public static final Dog DOG = new Dog(
            DogBreed.AFFENPINSCHER.toString(),
            AnimalCharacter.STRONG.toString(),
            AnimalName.ALEX.toString(),
            LocalDate.of(2020, 3, 24),
            300
    );

    public static final Cat CAT = new Cat(
            CatBreed.JAVANESE.toString(),
            AnimalCharacter.STRONG.toString(),
            AnimalName.YLA.toString(),
            LocalDate.of(2011, 12, 26),
            1200
    );

    public static final Shark SHARK = new Shark(
            SharkBreed.BULL_SHARK.toString(),
            AnimalCharacter.DANGEROUS.toString(),
            AnimalName.ALISA.toString(),
            LocalDate.of(2001, 4, 20),
            5000
    );

    public static final Wolf WOLF = new Wolf(
            WolfBreed.MEXICAN_WOLF.toString(),
            AnimalCharacter.HARMLESS.toString(),
            AnimalName.LUKA.toString(),
            LocalDate.of(2020, 3, 24),
            7000
    );
    private final List<Animal> constantsCatSharkDogWolf = List.of(CAT, SHARK, DOG, WOLF);
    public static final String EMPTY_MAP_STRING = "{}";
    public static final String EMPTY_STRING = "";
    private final AnimalsRepository animalsRepositoryImpl = new AnimalsRepositoryImpl();
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @ParameterizedTest(name = "List<Animal> is {0}")
    @NullSource
    @DisplayName("AnimalsRepositoryImpl.findLeapYearNames - list is null")
    void findLeapYearNames_null(List<Animal> animals) {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findLeapYearNames(animals).toString()
        );
    }
    @Test
    @DisplayName("AnimalsRepositoryImpl.findLeapYearNames - list is empty")
    void findLeapYearNames_empty() {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findLeapYearNames(new ArrayList<>()).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findLeapYearNames - no results")
    void findLeapYearNames_noResults() {
        List<Animal> animals = List.of(CAT,SHARK);
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findLeapYearNames(animals).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findLeapYearNames - normal")
    void findLeapYearNames() {
        assertEquals(
                "{Wolf Luka=[2020-03-24], Dog Alex=[2020-03-24]}",
                animalsRepositoryImpl.findLeapYearNames(constantsCatSharkDogWolf).toString()
        );
    }
    @ParameterizedTest(name = "List<Animal> is {0}")
    @NullSource
    @DisplayName("AnimalsRepositoryImpl.findOlderAnimals - list is null")
    void findOlderAnimals_null(List<Animal> animals) {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findOlderAnimals(animals, 18).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findOlderAnimals - list is empty")
    void findOlderAnimals_empty() {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findOlderAnimals(new ArrayList<>(), 18).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findOlderAnimals - no one is older")
    void findOlderAnimals_noOlder() {
        assertEquals(
                "{{\"type\":\"Shark\",\"breed\":\"Bull shark\",\"character\":\"Dangerous\",\"name\":\"Alisa\",\"birthdate\":\"20-04-2001\",\"cost\":\"$5000,00\"}=23}",
                animalsRepositoryImpl.findOlderAnimals(constantsCatSharkDogWolf, 40).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findOlderAnimals - normal")
    void findOlderAnimals() {
        Map<Animal, Integer> expected = new HashMap<>();
        expected.put(CAT, 13);
        expected.put(SHARK, 23);
        assertEquals(
                expected,
                animalsRepositoryImpl.findOlderAnimals(constantsCatSharkDogWolf, 10)
        );
    }

    @ParameterizedTest(name = "List<Animal> is {0}")
    @NullSource
    @DisplayName("AnimalsRepositoryImpl.findAllDuplicates - list is null")
    void findAllDuplicates_null(List<Animal> animals) {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findAllDuplicates(animals).toString()
        );
        assertEquals(EMPTY_STRING, outputStream.toString().trim());
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findAllDuplicates - list is empty")
    void findAllDuplicates_empty() {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findAllDuplicates(new ArrayList<>()).toString()
        );
        assertEquals(EMPTY_STRING, outputStream.toString().trim());
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findAllDuplicates - no duplicates")
    void findAllDuplicates_noDuplicates() {
        assertEquals(
                EMPTY_MAP_STRING,
                animalsRepositoryImpl.findAllDuplicates(constantsCatSharkDogWolf).toString()
        );
    }

    @Test
    @DisplayName("AnimalsRepositoryImpl.findAllDuplicates - normal")
    void findAllDuplicates() {
        Animal shark = new Shark();

        ArrayList<Animal> animals = new ArrayList<>(constantsCatSharkDogWolf);
        animals.add(shark);

        assertEquals("{Shark=2}", animalsRepositoryImpl.findAllDuplicates(animals).toString());
    }
}