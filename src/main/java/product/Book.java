package product;

public class Book extends Product {
    public Book(int price) {
        super("Book", price);
    }

    @Override
    public int getProductTaxeInPercentage() {
        return 0;
    }
}
