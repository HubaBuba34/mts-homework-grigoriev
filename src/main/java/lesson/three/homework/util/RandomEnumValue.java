package lesson.three.homework.util;

import java.util.Random;

public class RandomEnumValue<T extends Enum<T>> {
    private static final Random random = new Random();
    private final T[] values;

    public RandomEnumValue(Class<T> e) {
        values = e.getEnumConstants();
    }

    public T get() {
        return values[random.nextInt(values.length)];
    }

    public String getString() {
        return values[random.nextInt(values.length)].toString();
    }
}
