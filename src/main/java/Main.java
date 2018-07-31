import product.*;
import shopping.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Output 1");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.add(new Book(1249));
        cart1.add(new CD(1499));
        cart1.add(new ChocolateBar(85));
        System.out.println(cart1);

        System.out.println("");

        System.out.println("Output 2");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.add(Product.Imported(new ChocolateBox(1000)));
        cart2.add(Product.Imported(new PerfumeBottle(4750)));
        System.out.println(cart2);

        System.out.println("");

        System.out.println("Output 3");
        ShoppingCart cart3 = new ShoppingCart();
        cart3.add(Product.Imported(new PerfumeBottle(2799)));
        cart3.add(new PerfumeBottle(1899));
        cart3.add(new HeadachePills(975));
        cart3.add(Product.Imported(new ChocolateBox(1125)));
        System.out.println(cart3);
    }
}
