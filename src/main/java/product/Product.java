package product;

/**
 * This class describes a product.
 *
 * The price is stored as a integer (without coma).
 * e.g.: 1,30 euro is stored as 130
 */
public class Product {
    private final String name;
    int price;
    private boolean isImported = false;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Product Imported(Product product) {
        product.isImported = true;
        return product;
    }

    protected int getProductTaxeInPercentage() {
        return 10;
    }

    boolean isImported() {
        return isImported;
    }

    @Override
    public String toString() {
        return name + ": " + TaxeCalculator.calculatePrice(this);
    }
}
