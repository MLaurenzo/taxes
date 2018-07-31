package product;

/**
 * The goal of this class is to handle all taxes calculation.
 */
public class TaxeCalculator {
    /**
     * The price of the product plus the taxes.
     */
    public static int calculatePrice(Product product) {
        return product.price + calculateTaxes(product);
    }

    /**
     * The product tax plus the imported tax.
     */
    public static int calculateTaxes(Product product) {
        return calculateProductTax(product) + calculateImportedTax(product.isImported(), product.price);
    }

    /**
     * 10% tax on all product except books, food and medicine.
     */
    private static int calculateProductTax(Product product) {
        return roundTax(product.price * product.getProductTaxeInPercentage() / 100);
    }

    /**
     * 5% tax on imported products.
     */
    private static int calculateImportedTax(boolean isImported, int price) {
        return roundTax((isImported ? 5 : 0) * price / 100);
    }

    /**
     * 5 cents superior rounded tax.
     */
    public static int roundTax(int price) {
        return price + (4 - (price + 4) % 5);
    }
}
