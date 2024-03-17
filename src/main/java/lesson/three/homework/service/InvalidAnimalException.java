package lesson.three.homework.service;

import java.time.LocalDate;

public class InvalidAnimalException extends RuntimeException {
    public InvalidAnimalException() {
        super("На вход пришел неккоректный объект животного " + LocalDate.now());
    }
}
