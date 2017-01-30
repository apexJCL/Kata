package io.github.apexjcl.test;

import io.github.apexjcl.Factorial;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    private Factorial f = new Factorial();

    @Test
    public void isPositive() throws Exception {
        assertEquals("This should be true", true, f.isPositive("123"));
        assertEquals("This should be false", false, f.isPositive("-123"));
        assertEquals("This should be true", true, f.isPositive("9919122"));
        assertEquals("This should be false", false, f.isPositive("-1296978"));
        assertEquals("This should be true", true, f.isPositive("798156"));
    }

    @Test
    public void isInteger() throws Exception {
        assertEquals("This should be true", true, f.isInteger("987125396"));
        assertEquals("This should be false", false, f.isInteger("asdl12km"));
        assertEquals("This should be false", false, f.isInteger(" "));
        assertEquals("This should be false", false, f.isInteger(""));
        assertEquals("This should be false", false, f.isInteger("98.7125396"));
        assertEquals("This should be false", false, f.isInteger("-986"));
    }

    @Test
    public void isUnderIntegerLimit() throws Exception {
        assertEquals("This should be true", true, f.isUnderIntegerLimit(new BigDecimal("1")));
        assertEquals("This should be true", true, f.isUnderIntegerLimit(new BigDecimal("2147483647")));
        assertEquals("This should be false", false, f.isUnderIntegerLimit(new BigDecimal("2147483648")));
        assertEquals("This should be false", false, f.isUnderIntegerLimit(new BigDecimal("4147483647")));
        assertEquals("This should be false", false, f.isUnderIntegerLimit(new BigDecimal("2157483647")));
    }

    @Test
    public void privateFactorialCorrectValues() throws Exception {
        BigDecimal zeroFact = new BigDecimal(1);
        BigDecimal oneFact = new BigDecimal(1);
        BigDecimal fiveFact = new BigDecimal(120);
        BigDecimal tenFact = new BigDecimal("3628800");
        BigDecimal twentyOneFact = new BigDecimal("51090942171709440000");
        assertEquals("This should be 1", zeroFact, f._factorial(new BigDecimal(0)));
        assertEquals("This should be 1", oneFact, f._factorial(new BigDecimal(1)));
        assertEquals("This should be 120", fiveFact, f._factorial(new BigDecimal(5)));
        assertEquals("This should be 3628800", tenFact, f._factorial(new BigDecimal(10)));
        assertEquals("This should be 51090942171709440000", twentyOneFact, f._factorial(new BigDecimal(21)));
    }
}