package lesson.three.homework;

public class CustomAnimal  extends  AbstractAnimal {

    public CustomAnimal(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCharacter() {
        return character;
    }
}
