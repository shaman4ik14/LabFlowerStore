package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength; // not vital element
    private FlowerColor color; //represents the color (FlowerColor)
    private double price = 0;
    private FlowerType flowerType; //represent the type of Flower (FlowerType)

    public void setPrice(double newprice) {
        price = newprice;
    }

    public String getColor() {
        return color.toString();
    }

    public double getPrice()  {
        return price;
    }

    public FlowerType getFlowerType() {
        return flowerType;
    }
}
