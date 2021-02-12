package java.com.epam.brest.selector;

import com.epambrest.selector.PriceSelector;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class PriceSelectorTest {
    Map<Integer, BigDecimal> values = Map.of(
            1, new BigDecimal(100),
            2, new BigDecimal(200),
            3, new BigDecimal(300));

    PriceSelector priceSelector = new PriceSelector();

    @Test
    public void selectPriceMediumValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("2"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(200)));
    }

    @Test
    public void selectPriceZeroValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("0"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }

    @Test
    public void selectPriceMaxValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("4"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(300)));
    }

    @org.junit.Test
    public void selectPriceIncorrectValue() {

        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("-1"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }
}
