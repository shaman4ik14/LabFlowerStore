package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength; // not vital element
    private FlowerColor color; //represents the color (FlowerColor)
    private double price; //
    private FlowerType FlowerType; //represent the type of Flower (FlowerType)

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }

    public static void main(String[] args){
        System.out.print("Something");
    }

    public double getPrice() {
        return price;
    }

    public FlowerType getFlowerType() {
        return FlowerType;
    }
}
