package taxes;

import org.junit.Assert;
import org.junit.Test;
import shopping.TaxeCalculator;

public class TaxeCalculatorTest {
    @Test
    public void test_rounding() {
        Assert.assertEquals(0, TaxeCalculator.roundTax(0));
        Assert.assertEquals(100, TaxeCalculator.roundTax(99));
        Assert.assertEquals(100, TaxeCalculator.roundTax(100));
        Assert.assertEquals(105, TaxeCalculator.roundTax(101));
        Assert.assertEquals(105, TaxeCalculator.roundTax(102));
    }
}