package Product;

/**
 * This class describes a product.
 *
 * The price is stored as a integer (without coma).
 * e.g.: 1,30 euro is stored as 130
 */
public class Product {
    private int price;
    private boolean isImported = false;

    public Product(int price) {
        this.price = price;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
    }

    protected int getProductTaxe() {
        return 10;
    }

    public int calculatePrice() {
        return price + price*getProductTaxe()/100 + (isImported ? 5 : 0)*price/100;
    }
}
