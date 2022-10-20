package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower = new Rose();
        flowerPack = new FlowerPack(flower, price);
    }
    @Test
    public void testGetFlower() {
        Assertions.assertEquals(flower, flowerPack.getFlower());
    }
}
