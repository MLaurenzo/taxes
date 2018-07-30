package taxes;

public class TaxeCalculator {
    public static int roundTaxe(int price) {
        return price + (4-(price+4)%5);
    }
}
