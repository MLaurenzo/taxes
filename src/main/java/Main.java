import product.Book;
import product.CD;
import product.ChocolateBar;
import product.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Output 1");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.add(new Book(1249));
        cart1.add(new CD(1499));
        cart1.add(new ChocolateBar(85));
        System.out.println(cart1);
    }
}
