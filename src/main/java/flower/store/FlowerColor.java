package flower.store;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation; // color for representation

    //sample for constructor
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
