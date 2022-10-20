package flower.store;

import lombok.Getter;

public class FlowerPack {
    private final Flower flower;
    @Getter
    private final int quantity;

    FlowerPack(Flower flower, int quantity){
        this.flower = flower;
        this.quantity = quantity;
    }

    public Flower getFlower() {
        return flower;
    }
}
