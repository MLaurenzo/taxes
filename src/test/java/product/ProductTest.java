package product;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void taxes_10_percent_on_product() {
        Product product =  new Product(null, 100);
        Assert.assertEquals(110, product.calculatePrice());
    }

    @Test
    public void do_not_taxe_book() {
       Product product = new Book(100);
        Assert.assertEquals(100, product.calculatePrice());
    }

    @Test
    public void do_not_taxe_food() {
        Product product = new ChocolateBar(100);
        Assert.assertEquals(100, product.calculatePrice());
    }

    @Test
    public void do_not_taxe_medecine() {
        Product product = new HeadachePills(100);
        Assert.assertEquals(100, product.calculatePrice());
    }

    @Test
    public void taxe_imported_book() {
        Product product = Product.Imported(new Book(100));
        Assert.assertEquals(105, product.calculatePrice());
    }

    @Test
    public void taxe_imported_product() {
        Product product = Product.Imported(new Product(null, 100));
        Assert.assertEquals(115, product.calculatePrice());
    }
}
