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
    private FlowerBucket bucketone;
    private FlowerBucket buckettwo;

    @BeforeEach
    public void init() {
        flowerStore = new Store();
        bucketone = new FlowerBucket();
        buckettwo = new FlowerBucket();
    }

    @Test
    public void testContain() {
        int priceone = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityone = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int pricetwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantitytwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flowerone = new Rose();
        Flower flowertwo = new Flower();
        flowertwo.setFlowerType(FlowerType.TULIP);
        flowerone.setPrice(priceone);
        flowertwo.setPrice(pricetwo);
        FlowerPack flowerPackone = new FlowerPack(flowerone, quantityone);
        FlowerPack flowerPacktwo = new FlowerPack(flowertwo, quantitytwo);
        bucketone.add(flowerPackone);
        buckettwo.add(flowerPacktwo);
        flowerStore.addbucket(bucketone);
        flowerStore.addbucket(buckettwo);
        ArrayList<FlowerBucket> resultone = new ArrayList<>();
        ArrayList<FlowerBucket> resulttwo = new ArrayList<>();
        resultone.add(bucketone);
        resulttwo.add(buckettwo);
        Assertions.assertEquals(resultone,
                flowerStore.searchbucket(FlowerType.ROSE));
        Assertions.assertEquals(resulttwo,
                flowerStore.searchbucket(FlowerType.TULIP));
    }
}
