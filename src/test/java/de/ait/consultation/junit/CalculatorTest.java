package de.ait.consultation.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Disabled("Method is not finished")
    @Test
    @DisplayName("Should add two number without mistakes")
    void testShouldAddTwoNumbers() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
//        assertNotEquals(4, 3);
//        assertTrue(true);
//        assertFalse(false);
//        assertNull(null);
//        assertNotNull(result);
//        assertThrows(Exception.class, () -> calculator.add(1, 2));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 6, 9, 23})
    public void testShouldReturnTrue(int number) {
        assertTrue(calculator.checkPositive(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -5, -6, -9, -23})
    public void testShouldReturnFalse(int number) {
        assertFalse(calculator.checkPositive(number));
    }

    @ParameterizedTest
    @CsvSource({
            "5", "false",
            "12", "false",
            "18", "true",
            "21", "true",
            "56", "true"
    })
    void shouldCheckPersonAge(int age, boolean expected) {
        boolean result = calculator.isAdult(age);
        assertEquals(expected, result);
    }
}
