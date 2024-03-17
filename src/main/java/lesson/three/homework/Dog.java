package lesson.three.homework;

import lesson.three.homework.service.RandomDates;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends Pet{
    static Random random = new Random();
    private static String[] breeds = {"Akita inu Dog", "American bully Dog", "Beagle Dog",
            "Boxer Dog", "Bull Terrier Dog"};
    private static String[] names = {"Jek","Alfa", "Eva", "Took", "Room"};
    private static double[] costs = {10000, 15000, 20000, 25000, 30000};
    private static String[] characters = {"Evil", "Amenable to training", "Wild", "Dangerous",
            "Harmless"};
    private static LocalDate birthDate = RandomDates.createRandomDate(2008,2024);
    public Dog() {
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
