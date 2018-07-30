package product;

import taxes.TaxeCalculator;

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

    protected int getProductTaxeInPercentage() {
        return 10;
    }

    public int calculatePrice() {
        return price + getProductTaxe() + getImportationTaxe();
    }

    private int getProductTaxe() {
        return TaxeCalculator.roundTaxe(price*getProductTaxeInPercentage()/100);
    }

    private int getImportationTaxe() {
        return TaxeCalculator.roundTaxe((isImported ? 5 : 0)*price/100);
    }
}
