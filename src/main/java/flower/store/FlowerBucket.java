package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    ArrayList<FlowerPack> Bucket = new ArrayList<>();

    public void add(FlowerPack flowerPack){
        Bucket.add(flowerPack);
    }

    public double getPrice(){
        double price = 0;
        for (FlowerPack i:Bucket) {
            double current;
            current = i.getFlower().getPrice() * i.getQuantity();
            price = price + current;
        }
        return price;
    }

    public boolean contains(FlowerType flower){
        for(FlowerPack flowers:Bucket){
            if (flowers.getFlower().getFlowerType() == flower){
                return true;
            }
        }
        return false;
    }
}