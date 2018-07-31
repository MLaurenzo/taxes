package product;

public class Medicine extends Product {
    public Medicine(String name, int price) {
        super(name, price);
    }

    @Override
    public int getProductTaxeInPercentage() {
        return 0;
    }
}
