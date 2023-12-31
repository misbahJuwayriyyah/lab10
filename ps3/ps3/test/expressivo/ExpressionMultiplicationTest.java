package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for the Multiplication expression in the Expression hierarchy.
 */
public class ExpressionMultiplicationTest {

    /**
     * Ensures that assertions are enabled.
     */
    @Test(expected = AssertionError.class)
    public void testAssertionsEnabled() {
        assert false;
    }

    /**
     * Tests the string representation of a constant expression.
     */
    @Test
    public void testConstantExpressionToString() {
        Expression constantExpression = new ConstantExpression(42.0);
        assertEquals("42.0", constantExpression.toString());
    }

    /**
     * Tests the string representation of a multiplication expression.
     */
    @Test
    public void testMultiplyExpressionToString() {
        Expression constant1 = new ConstantExpression(5.0);
        Expression constant2 = new ConstantExpression(4.0);
        Expression multiplyExpression = new Multiplication(constant1, constant2);
        assertEquals("(5.0 * 4.0)", multiplyExpression.toString());
    }

    /**
     * Tests the string representation of a nested multiplication expression.
     */
    @Test
    public void testNestedMultiplyExpressionToString() {
        Expression constant1 = new ConstantExpression(3.0);
        Expression constant2 = new ConstantExpression(2.0);
        Expression constant3 = new ConstantExpression(6.0);
        Expression multiplyExpression1 = new Multiplication(constant1, constant2);
        Expression multiplyExpression2 = new Multiplication(multiplyExpression1, constant3);
        assertEquals("((3.0 * 2.0) * 6.0)", multiplyExpression2.toString());
    }

    /**
     * Tests the string representation of a complex expression involving multiplication.
     */
    @Test
    public void testComplexExpressionToString() {
        Expression constant1 = new ConstantExpression(2.0);
        Expression constant2 = new ConstantExpression(5.0);
        Expression constant3 = new ConstantExpression(3.0);
        Expression multiplyExpression1 = new Multiplication(constant1, constant2);
        Expression multiplyExpression2 = new Multiplication(multiplyExpression1, constant3);
        Expression constant4 = new ConstantExpression(7.0);
        Expression multiplyExpression3 = new Multiplication(multiplyExpression2, constant4);
        assertEquals("(((2.0 * 5.0) * 3.0) * 7.0)", multiplyExpression3.toString());
    }
}
