package Product;

public class Book extends Product {
    public Book(int price) {
        super(price);
    }

    @Override
    protected int getProductTaxeInPercentage() {
        return 0;
    }
}
