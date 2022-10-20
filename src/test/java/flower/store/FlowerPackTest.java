package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;


public class FlowerPackTest {
    Random RANDOM_GENERATOR;
    int MAX_PRICE;
    Flower flower;
    FlowerPack flowerPack;

    @BeforeEach
    public void init(){
        RANDOM_GENERATOR = new Random();
        MAX_PRICE = 100;
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower = new Rose();
        flowerPack = new FlowerPack(flower, price);
    }
    @Test
    public void testGetFlower(){
        Assertions.assertEquals(flower, flowerPack.getFlower());
    }
}
