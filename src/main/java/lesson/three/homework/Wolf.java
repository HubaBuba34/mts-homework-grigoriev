package lesson.three.homework;

import java.util.Random;

public class Wolf extends Predator{
    static Random random = new Random();
    private static String[] breeds = {"Lyre Wolf", "Japanese Wolf", "Ethiopian Wolf",
        "Steppenwolf", "Caucasian Wolf"};
    private static String[] names = {"Alex","Steev", "Iris", "Anna", "Glak"};
    private static double[] costs = {50000, 60000, 70000, 80000, 90000};
    private static String[] characters = {"Evil", "Amenable to training", "Wild", "Dangerous",
        "Harmless"};
    public Wolf(){
        super(setBreed(),setName(), setCost(),setCharacter());
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
}