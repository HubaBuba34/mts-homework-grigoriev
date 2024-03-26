package lesson.three.homework.Animals;

import lesson.three.homework.Animals.Enums.AnimalType;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pet extends AbstractAnimal {
    protected double cost;

    protected static final int COST_BOUND = 10000;

    public Pet(AnimalType type, String breed, String character, String name, double cost, LocalDate birthdate) {
        super(type, breed, character, name, cost, birthdate);
        this.cost = cost;
    }

    @Override
    public AnimalType getType() {
        return super.type;
    }

    @Override
    public String getBreed() {
        return super.breed;
    }

    @Override
    public String getCharacter() {
        return super.character;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public LocalDate getBirthdate() {
        return super.birthdate;
    }

    @Override
    public String getBirthdateFormat() {
        return super.birthdateFormat;
    }

    @Override
    public void setBirthdateFormat(String format) throws IllegalArgumentException {
        try {
            DateTimeFormatter.ofPattern(format);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Format string is wrong for date-time formatting");
        }

        this.birthdateFormat = format;
    }

    @Override
    public String getBirthdateFormatted() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(getBirthdateFormat());
        return super.birthdate.format(dtf);
    }
    @Override
    public double getCost() {
        return super.cost;
    }

    @Override
    public String toString() {
        return "{"
                + "\"type\":" + (this.type == null ? "null," : "\"" + getType() + "\",")
                + "\"breed\":" + (this.breed == null ? "null," : "\"" + getBreed() + "\",")
                + "\"character\":" + (this.character == null ? "null," : "\"" + getCharacter() + "\",")
                + "\"name\":" + (this.name == null ? "null," : "\"" + getName() + "\",")
                + "\"birthdate\":" + (this.birthdate == null ? "null," : "\"" + getBirthdateFormatted() + "\",")
                + "\"cost\":\"" + new DecimalFormat("$#0.00").format(getCost()) + "\""
                + "}";
    }
}
