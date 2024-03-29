package lesson.three.homework.Animals.Enums;

@SuppressWarnings("unused")
public enum SharkBreed {
    ANGEL_SHARK("Angel shark"), BLACKTIP_SHARK("Blacktip shark"), BULL_SHARK("Bull shark"),
    GALAPAGOS_SHARK("Galapagos shark"), LEMON_SHARK("Lemon shark"), LEOPARD_SHARK("Leopard shark"),
    SANDBAR_SHARK("Sandbar shark"), WHALE_SHARK("Whale shark"), WHITE_SHARK("White shark"),
    ZEBRA_SHARK("Zebra shark");

    private final String printable;

    SharkBreed(String printable) {
        this.printable = printable;
    }

    @Override
    public String toString() {
        return this.printable;
    }
}
