package lesson.three.homework;

import lesson.three.homework.service.RandomDates;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;


public class Cat extends Pet{
    static Random random = new Random();
    private static String[] breeds = {"Abyssinian Cat", "Persian Cat", "Siamese Cat",
            "Siberian Cat", "Sphynx Cat"};
    private static String[] names = {"Luka","Eva", "Alisa", "Dudi", "Yla"};
    private static double[] costs = {8000, 8500, 9000, 9500, 10000};
    private static String[] characters = {"Evil", "Amenable to training", "Wild", "Dangerous",
            "Harmless"};
    private static LocalDate birthDate = RandomDates.createRandomDate(2008,2024);
    public Cat() {
        super(setBreed(),setName(), setCost(),setCharacter(),setBirthDate());
    }
    public static String setBreed() {
        return breeds[random.nextInt(breeds.length)];
    }
    public static String setName() {
        return names[random.nextInt(names.length)];
    }
    public static double setCost() {
        return costs[random.nextInt(costs.length)];
    }
    public static String setCharacter() {
        return characters[random.nextInt(characters.length)];
    }
    public static LocalDate setBirthDate(){ return birthDate; }
}
