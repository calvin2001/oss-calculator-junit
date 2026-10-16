package itm.oss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    void addTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3)); // 2 + 3 = 5 → 통과
    }

    @Test
    void isFourPrime() {
        Calculator calc = new Calculator();
        assertTrue(calc.isPrime(4), "4 is not prime."); // 4는 소수가 아님 → 실패
    }

}
