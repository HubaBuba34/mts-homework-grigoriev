package lesson.three.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import lesson.three.homework.Exceptions.InvalidAnimalBirthdateException;
import lesson.three.homework.Exceptions.InvalidAnimalException;
import lesson.three.homework.Animals.*;
import lesson.three.homework.Animals.Enums.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchServiceImplTest {
    private final SearchService searchServiceImpl = new SearchServiceImpl();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    static class LeapYearAnimalsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new Cat(CatBreed.JAVANESE.toString(), AnimalCharacter.NERVOUS.toString(), AnimalName.EVA.toString(), LocalDate.of(2012, 11, 12), 1200)),
                    Arguments.of(new Cat(CatBreed.BURMILLA.toString(), AnimalCharacter.DANGEROUS.toString(), AnimalName.ALEX.toString(), LocalDate.of(2004, 2, 29), 10000)),
                    Arguments.of(new Shark(SharkBreed.LEMON_SHARK.toString(), AnimalCharacter.AMENABLE_TO_TRAINING.toString(), AnimalName.YLA.toString(), LocalDate.of(2024, 12, 11),10000))
            );
        }
    }

    static class NotLeapYearAnimalsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new Wolf(WolfBreed.MEXICAN_WOLF.toString(), AnimalCharacter.WILD.toString(), AnimalName.LUKA.toString(), LocalDate.of(2001, 7, 14),8000)),
                    Arguments.of(new Dog(DogBreed.AFFENPINSCHER.toString(), AnimalCharacter.STRONG.toString(), AnimalName.ALISA.toString(), LocalDate.of(2019, 9, 2), 300)),
                    Arguments.of(new Shark(SharkBreed.ANGEL_SHARK.toString(), AnimalCharacter.HARMLESS.toString(), AnimalName.DUDI.toString(), LocalDate.of(1991, 4, 20),7000))
            );
        }
    }

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("Animal is null")
    void checkLeapYearAnimal_animalIsNull() {
        InvalidAnimalException thrown = assertThrows(InvalidAnimalException.class, new Executable() {
            @Override
            public void execute() throws InvalidAnimalBirthdateException {
                // searchServiceImpl.checkLeapYearAnimal() could throw checked
                // InvalidAnimalBirthdateException so this exception has been added
                // into throws section of execute() to throw it upstream instead of
                // using try-catch in this test and to show that this type of
                // exception must be handled or thrown up

                searchServiceImpl.checkLeapYearAnimal(null);
            }
        });

        assertEquals("Incorrect animal has been passed for check at " + LocalDate.now(), thrown.getMessage());
    }

    @Test
    @DisplayName("Animal birthdate is null")
    void checkLeapYearAnimal_animalBirthdateIsNull() {
        Animal shark = new Shark(
                SharkBreed.ANGEL_SHARK.toString(),
                AnimalCharacter.DANGEROUS.toString(),
                AnimalName.ALEX.toString(),
                null,
                10000
        );

        InvalidAnimalBirthdateException thrown = assertThrows(InvalidAnimalBirthdateException.class, new Executable() {
            @Override
            public void execute() throws InvalidAnimalBirthdateException {
                searchServiceImpl.checkLeapYearAnimal(shark);
            }
        });

        assertEquals(shark.getType() + " passed for check has not birthdate filled", thrown.getMessage());
    }

    @ParameterizedTest(name = "{0}")
    @ArgumentsSource(LeapYearAnimalsArgumentsProvider.class)
    @DisplayName("Animals was born on a leap year")
    void checkLeapYearAnimal_bornOnLeapYear(Animal animal) {
        assertDoesNotThrow(() -> {
            searchServiceImpl.checkLeapYearAnimal(animal);
        });

        assertEquals(animal.getName() + " was born on a leap year", outputStreamCaptor.toString().trim());
    }

    @ParameterizedTest(name = "{0}")
    @ArgumentsSource(NotLeapYearAnimalsArgumentsProvider.class)
    @DisplayName("Animals was not born on a leap year")
    void checkLeapYearAnimal_notBornOnLeapYear(Animal animal) {
        assertDoesNotThrow(() -> {
            searchServiceImpl.checkLeapYearAnimal(animal);
        });

        assertEquals(animal.getName() + " was not born on a leap year", outputStreamCaptor.toString().trim());
    }
}