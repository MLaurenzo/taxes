package Product;

public class Medecine extends Product {
    public Medecine(int price) {
        super(price);
    }

    @Override
    protected int getProductTaxe() {
        return 0;
    }
}
