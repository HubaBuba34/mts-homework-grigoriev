package lesson.three.homework.Animals.Enums;

@SuppressWarnings("unused")
public enum AnimalName {
    LUKA("Luka"), ALEX("Alex"), EVA("Eva"), DUDI("Dudi"), YLA("Yla"), ALISA("Alisa");

    private final String printable;

    AnimalName(String printable) {
        this.printable = printable;
    }

    @Override
    public String toString() {
        return this.printable;
    }
}
