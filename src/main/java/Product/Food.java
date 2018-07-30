package Product;

public class Food extends Product {
    public Food(int price) {
        super(price);
    }

    @Override
    protected int getProductTaxeInPercentage() {
        return 0;
    }
}
