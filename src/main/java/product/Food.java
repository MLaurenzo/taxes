package product;

public class Food extends Product {
    public Food(String name, int price) {
        super(name, price);
    }

    @Override
    public int getProductTaxeInPercentage() {
        return 0;
    }
}
