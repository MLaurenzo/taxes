package taxes;

import org.junit.Assert;
import org.junit.Test;

public class TaxeCalculatorTest {
    @Test
    public void test_rounding() {
        Assert.assertEquals(0, TaxeCalculator.roundTaxe(0));
        Assert.assertEquals(100, TaxeCalculator.roundTaxe(99));
        Assert.assertEquals(100, TaxeCalculator.roundTaxe(100));
        Assert.assertEquals(105, TaxeCalculator.roundTaxe(101));
        Assert.assertEquals(105, TaxeCalculator.roundTaxe(102));
    }
}