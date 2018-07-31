package shopping;

public class PriceRenderer {
    public static String render(int price) {
        return String.valueOf(price / 100) + '.' + String.valueOf(price % 100);
    }
}
