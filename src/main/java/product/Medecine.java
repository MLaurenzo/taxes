package product;

public class Medecine extends Product {
    public Medecine(int price) {
        super("Medecine", price);
    }

    @Override
    protected int getProductTaxeInPercentage() {
        return 0;
    }
}
