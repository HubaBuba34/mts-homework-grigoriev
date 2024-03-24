package lesson.three.homework.Animals.Enums;


@SuppressWarnings("unused")
public enum AnimalCharacter {
    EVIL("Evil"), AMENABLE_TO_TRAINING("Amenable to training"), WILD("Wild"), DANGEROUS("Dangerous"), HARMLESS("Harmless"),
    NERVOUS("Nervous"), STRONG("strong");

    private final String printable;

    AnimalCharacter(String printable) {
        this.printable = printable;
    }

    @Override
    public String toString() {
        return this.printable;
    }
}
