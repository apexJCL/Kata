package io.github.apexjcl;

import java.math.BigDecimal;

public class Factorial {

    private BigDecimal _maxValue = new BigDecimal("2147483647");
    private BigDecimal _one = new BigDecimal(1);


    /**
     * Calculates the factorial of a given
     * @param value
     * @return
     */
    public BigDecimal factorial(String value){

    }

    /**
     * Calculates the factorial of a BigDecimal positive number
     * @param value
     * @return
     */
    public BigDecimal _factorial(BigDecimal value) {
        BigDecimal result = new BigDecimal(1);
        BigDecimal counter = new BigDecimal(1);
        while (counter.compareTo(value) <= 0) {
            result = result.multiply(counter);
            counter = counter.add(_one);
        }
        return result;
    }

    /**
     * Checks if a number is negative by matching a symbol
     *
     * @param value
     * @return
     */
    public boolean isPositive(String value) {
        return !value.matches("-.*");
    }

    /**
     * Checks if the value it's an integer
     *
     * @param value
     * @return
     */
    public boolean isInteger(String value) {
        return value.matches("[0-9]+");
    }

    /**
     * Checks that the value is under the signed integer limit (32 bits)
     *
     * @param value
     * @return
     */
    public boolean isUnderIntegerLimit(BigDecimal value) {
        return value.compareTo(_maxValue) <= 0;
    }
}
