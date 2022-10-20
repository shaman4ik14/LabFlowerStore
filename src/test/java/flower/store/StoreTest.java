package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE  = 100;

    private Store flowerStore;
    private FlowerBucket Bucket1;
    private FlowerBucket Bucket2;

    @BeforeEach
    public void init() {
        flowerStore = new Store();
        Bucket1 = new FlowerBucket();
        Bucket2 = new FlowerBucket();
    }

    @Test
    public void testContain(){
        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int price2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity2 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower1 = new Rose();
        Flower flower2 = new Flower();
        flower2.setFlowerType(FlowerType.TULIP);
        flower1.setPrice(price1);
        flower2.setPrice(price2);
        FlowerPack flowerPack1 = new FlowerPack(flower1, quantity1);
        FlowerPack flowerPack2 = new FlowerPack(flower2, quantity2);
        Bucket1.add(flowerPack1);
        Bucket2.add(flowerPack2);
        flowerStore.add_bucket(Bucket1);
        flowerStore.add_bucket(Bucket2);
        ArrayList<FlowerBucket> result1 = new ArrayList<>();
        ArrayList<FlowerBucket> result2 = new ArrayList<>();
        result1.add(Bucket1);
        result2.add(Bucket2);
        Assertions.assertEquals(result1, flowerStore.search_bucket(FlowerType.ROSE));
        Assertions.assertEquals(result2, flowerStore.search_bucket(FlowerType.TULIP));
    }
}
