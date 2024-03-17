package lesson.three.homework;

import lesson.three.homework.service.RandomDates;

import java.time.LocalDate;
import java.util.Random;

public class Shark extends Predator{
    static Random random = new Random();
    private static String[] breeds = {"Whale Shark", "Giant shark", "Largemouth Shark",
            "White Shark", "Tiger Shark"};
    private static String[] names = {"Mika","Weely", "Glank", "Afred", "Terla"};
    private static double[] costs = {100000, 200000, 300000, 400000, 500000};
    private static String[] characters = {"Evil", "Amenable to training", "Wild", "Dangerous",
            "Harmless"};
    private static LocalDate birthDate = RandomDates.createRandomDate(2008,2024);
    public Shark() {
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
    public static LocalDate setBirthDate(){return birthDate;}
}
