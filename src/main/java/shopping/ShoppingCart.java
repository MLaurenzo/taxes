package shopping;

import product.Product;
import product.TaxeCalculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return products.stream()
            .map(product -> product.toString())
            .reduce((a, b) -> a.toString() + '\n' + b.toString())
            .get()
            + "\nTaxes: " + PriceRenderer.render(products.stream().mapToInt(TaxeCalculator::calculateTaxes).sum())
            + "\nTotal: " + PriceRenderer.render(products.stream().mapToInt(TaxeCalculator::calculatePrice).sum());
    }
}
