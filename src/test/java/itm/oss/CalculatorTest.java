package itm.oss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests for OSS class")
class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for function add")
    void testAdd() {
        assertEquals(10, calc.add(5, 5), "5 + 5 should be 10");
    }

    @Test
    @DisplayName("Testing function isPrime with 5")
    void isFivePrime() {
        assertTrue(calc.isPrime(5), "5 is prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with 4")
    void isFourPrime() {
        assertFalse(calc.isPrime(4), "4 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with 0")
    void isZeroNotPrime() {
        assertFalse(calc.isPrime(0), "0 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with negative numbers")
    void testNegativeNumbers() {
        assertFalse(calc.isPrime(-1), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-2), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-3), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-4), "There are not negative primer numbers.");
        assertFalse(calc.isPrime(-5), "There are not negative primer numbers.");
    }

    @Test
    @DisplayName("Add two numbers")
    void addTwoNumbers() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should be 5"); // 통과
    }

}