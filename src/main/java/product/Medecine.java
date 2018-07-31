package product;

public class Medecine extends Product {
    public Medecine(String name, int price) {
        super(name, price);
    }

    @Override
    protected int getProductTaxeInPercentage() {
        return 0;
    }
}
