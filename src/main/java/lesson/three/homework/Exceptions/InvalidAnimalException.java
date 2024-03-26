package lesson.three.homework.Exceptions;

public class InvalidAnimalException extends RuntimeException {
    public InvalidAnimalException(String message) {
        super(message);
    }
}
