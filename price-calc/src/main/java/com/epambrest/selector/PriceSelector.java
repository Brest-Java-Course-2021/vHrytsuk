package com.epambrest.selector;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;


public class PriceSelector {
    public BigDecimal selectPriceValue(Map<Integer, BigDecimal> valuseMap, BigInteger targetValue) {
        SortedSet<Integer> sortedKeys = new TreeSet<>(valuseMap.keySet());
        Integer resultKey = sortedKeys.first();
        for (Integer key : sortedKeys) {
            if (resultKey >= targetValue.doubleValue()) {
                break;
            }
            resultKey = key;
        }

        BigDecimal resultValue = valuseMap.get(resultKey);
        return resultValue;
    }
}
