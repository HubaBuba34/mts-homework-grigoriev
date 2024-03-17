package lesson.three.homework;

import lesson.three.homework.service.InvalidAnimalBirthDateException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class SearchServiceTest {
    @ParameterizedTest
    @MethodSource("petStream")
    @DisplayName("Тестирование метода checkLeapYearAnimal, когда дата есть")
    void checkLeapYearAnimal(Pet pet) throws InvalidAnimalBirthDateException {
        CreateAnimalServiceImpl сreateAnimalServiceImpl = new CreateAnimalServiceImpl();
        сreateAnimalServiceImpl.checkLeapYearAnimal(pet);
    }
    @ParameterizedTest
    @MethodSource("nullBithDateStream")
    @DisplayName("Тестирование метода checkLeapYearAnimal, когда даты нет")
    void checkLeapYearAnimalNullBithDate(Pet pet) {
        CreateAnimalServiceImpl сreateAnimalServiceImpl = new CreateAnimalServiceImpl();
        Exception exception = assertThrows(Exception.class,() -> сreateAnimalServiceImpl.checkLeapYearAnimal(pet));
        assertEquals("У животного test3 не указана дата его рождения",exception.getMessage());
    }

    @ParameterizedTest
    @NullSource
    @DisplayName("Тестирование метода checkLeapYearAnimal, когда дата некорректная ")
    void checkLeapYearAnimalIncorrectBithDate(Pet pet) {
        CreateAnimalServiceImpl сreateAnimalServiceImpl = new CreateAnimalServiceImpl();
        RuntimeException runtimeException = assertThrows(RuntimeException.class,() -> сreateAnimalServiceImpl.checkLeapYearAnimal(pet));
        assertEquals("На вход пришел неккоректный объект животного 2024-03-15",runtimeException.getMessage());
    }
    private static Stream<Pet> petStream() {
        return Stream.of(new Pet("test1", "test1", 7000, "test1", LocalDate.parse("2023-02-02")),
                                        new Pet("test2","test2",7000,"test2",LocalDate.parse("2022-02-02")));
    }
    private static Stream<Pet> nullBithDateStream() {
        return Stream.of(new Pet("test3","test3",7000,"test3",null));
    }
}
