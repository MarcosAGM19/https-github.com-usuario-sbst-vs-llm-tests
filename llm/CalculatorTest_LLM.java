import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * GitHub Copilot Generated Test Suite - LLM Approach
 * Generated using AI-powered code completion and prompt engineering
 * Focus: Functional correctness and user scenarios
 */
@DisplayName("Calculator LLM Test Suite")
public class CalculatorTest_LLM {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Should correctly add two positive integers")
    public void shouldAddTwoPositiveIntegers() {
        // Given two positive integers
        int a = 10;
        int b = 20;
        // When adding them
        int result = calculator.add(a, b);
        // Then the result should be their sum
        assertEquals(30, result, "10 + 20 should equal 30");
    }

    @Test
    @DisplayName("Should handle addition with negative numbers")
    public void shouldHandleAdditionWithNegativeNumbers() {
        assertEquals(-10, calculator.add(-5, -5), "Addition of negative numbers");
        assertEquals(5, calculator.add(10, -5), "Adding negative to positive");
    }

    @Test
    @DisplayName("Should perform subtraction correctly")
    public void shouldPerformSubtractionCorrectly() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-5, calculator.subtract(5, 10));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    @DisplayName("Should multiply integers accurately")
    public void shouldMultiplyIntegersAccurately() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(-20, calculator.multiply(-4, 5));
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    public void shouldThrowExceptionWhenDividingByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0),
            "Dividing by zero should throw IllegalArgumentException"
        );
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }

    @Test
    @DisplayName("Should divide integers correctly")
    public void shouldDivideIntegersCorrectly() {
        assertEquals(3, calculator.divide(9, 3));
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Should identify even numbers")
    public void shouldIdentifyEvenNumbers() {
        assertTrue(calculator.isEven(2), "2 should be even");
        assertTrue(calculator.isEven(0), "0 should be even");
        assertTrue(calculator.isEven(-4), "-4 should be even");
    }

    @Test
    @DisplayName("Should identify odd numbers")
    public void shouldIdentifyOddNumbers() {
        assertFalse(calculator.isEven(1), "1 should be odd");
        assertFalse(calculator.isEven(3), "3 should be odd");
        assertFalse(calculator.isEven(-5), "-5 should be odd");
    }

    @Test
    @DisplayName("Should calculate factorial for valid inputs")
    public void shouldCalculateFactorialForValidInputs() {
        assertEquals(1, calculator.factorial(0), "0! should be 1");
        assertEquals(1, calculator.factorial(1), "1! should be 1");
        assertEquals(24, calculator.factorial(4), "4! should be 24");
        assertEquals(120, calculator.factorial(5), "5! should be 120");
    }

    @Test
    @DisplayName("Should throw exception for negative factorial")
    public void shouldThrowExceptionForNegativeFactorial() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.factorial(-5),
            "Negative factorial should throw exception"
        );
    }

    @Test
    @DisplayName("Should find maximum in array")
    public void shouldFindMaximumInArray() {
        assertEquals(10, calculator.findMaximum(new int[]{1, 5, 10, 3}));
        assertEquals(5, calculator.findMaximum(new int[]{5}));
        assertEquals(100, calculator.findMaximum(new int[]{-50, 0, 100, 50}));
    }

    @Test
    @DisplayName("Should throw exception for null array")
    public void shouldThrowExceptionForNullArray() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.findMaximum(null),
            "Null array should throw exception"
        );
    }

    @Test
    @DisplayName("Should throw exception for empty array")
    public void shouldThrowExceptionForEmptyArray() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.findMaximum(new int[]{}),
            "Empty array should throw exception"
        );
    }

    @Test
    @DisplayName("Should identify prime numbers correctly")
    public void shouldIdentifyPrimeNumbersCorrectly() {
        assertTrue(calculator.isPrime(2), "2 is prime");
        assertTrue(calculator.isPrime(3), "3 is prime");
        assertTrue(calculator.isPrime(5), "5 is prime");
        assertTrue(calculator.isPrime(17), "17 is prime");
    }

    @Test
    @DisplayName("Should identify non-prime numbers correctly")
    public void shouldIdentifyNonPrimeNumbersCorrectly() {
        assertFalse(calculator.isPrime(0), "0 is not prime");
        assertFalse(calculator.isPrime(1), "1 is not prime");
        assertFalse(calculator.isPrime(4), "4 is not prime");
        assertFalse(calculator.isPrime(6), "6 is not prime");
    }

    @Test
    @DisplayName("Should handle decimal division results (integer truncation)")
    public void shouldHandleDecimalDivisionResults() {
        assertEquals(2, calculator.divide(5, 2), "5 / 2 should be 2 (integer division)");
        assertEquals(0, calculator.divide(1, 2), "1 / 2 should be 0");
    }

    @Test
    @DisplayName("Comprehensive scenario: Banking calculation")
    public void shouldHandleBankingCalculationScenario() {
        // Simulate a banking scenario
        int balance = 1000;
        balance = calculator.add(balance, 500);  // Deposit
        balance = calculator.subtract(balance, 200);  // Withdrawal
        assertEquals(1300, balance, "Final balance should be 1300");
    }

    @Test
    @DisplayName("Comprehensive scenario: Statistics calculation")
    public void shouldHandleStatisticsCalculationScenario() {
        int[] numbers = {10, 20, 30, 40, 50};
        int max = calculator.findMaximum(numbers);
        assertEquals(50, max, "Maximum should be 50");
    }
}