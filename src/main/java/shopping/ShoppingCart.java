package shopping;

import product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represent a shopping cart. It is used to store products and calculate total price.
 */
public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return printProductsPrice() + "\n"
            + printTotalTaxes() + "\n"
            + printTotalPrice();
    }

    private String printProductsPrice() {
        return products.stream()
            .map(product -> product.toString())
            .reduce((a, b) -> a.toString() + '\n' + b.toString())
            .get();
    }

    private String printTotalTaxes() {
        return "Taxes: " + PriceRenderer.render(products.stream().mapToInt(TaxeCalculator::calculateTaxes).sum());
    }

    private String printTotalPrice() {
        return "Total: " + PriceRenderer.render(products.stream().mapToInt(TaxeCalculator::calculatePrice).sum());
    }
}
