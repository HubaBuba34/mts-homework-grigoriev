package lesson.three.homework.Animals.Enums;

@SuppressWarnings("unused")
public enum CatBreed {
    BALINESE("Balinese"), BIRMAN("Birman"), BURMESE("Burmese"), BURMILLA("Burmilla"), CHARTREUX("Chartreux"),
    CORNISH_REX("Cornish Rex"), JAVANESE("Javanese"), PERSIAN("Persian"), SIBERIAN("Siberian"), SPHYNX("Sphynx");

    private final String printable;

    CatBreed(String printable) {
        this.printable = printable;
    }

    @Override
    public String toString() {
        return this.printable;
    }
}
