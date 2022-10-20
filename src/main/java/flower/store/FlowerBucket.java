package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    ArrayList<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        bucket.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack i:bucket) {
            double current;
            current = i.getFlower().getPrice() * i.getQuantity();
            price = price + current;
        }
        return price;
    }

    public boolean contains(FlowerType flower) {
        for (FlowerPack flowers:bucket) {
            if (flowers.getFlower().getFlowerType() == flower) {
                return true;
            }
        }
        return false;
    }
}