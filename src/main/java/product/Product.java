package product;

import taxes.TaxeCalculator;

/**
 * This class describes a product.
 *
 * The price is stored as a integer (without coma).
 * e.g.: 1,30 euro is stored as 130
 */
public class Product {
    private final String name;
    private int price;
    private boolean isImported = false;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Product Imported(Product product) {
        product.setIsImported(true);
        return product;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
    }

    protected int getProductTaxeInPercentage() {
        return 10;
    }

    public int calculatePrice() {
        return price + getTaxe();
    }

    private int getProductTaxe() {
        return TaxeCalculator.roundTaxe(price*getProductTaxeInPercentage()/100);
    }

    private int getImportationTaxe() {
        return TaxeCalculator.roundTaxe((isImported ? 5 : 0)*price/100);
    }

    public int getTaxe() {
        return getProductTaxe() + getImportationTaxe();
    }

    @Override
    public String toString() {
        return name + ": " + calculatePrice();
    }
}
