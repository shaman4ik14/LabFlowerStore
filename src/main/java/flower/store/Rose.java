package flower.store;

import lombok.Getter;

public class Rose extends Flower {
    private final FlowerColor color = FlowerColor.RED;
    private double price;
    @Getter
    private final FlowerType flowertype = FlowerType.ROSE;

    public FlowerType getFlowerType() {
        return flowertype;
    }
}
