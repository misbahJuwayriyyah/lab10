package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for the Expression hierarchy.
 */
public class ExpressionTest {

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
        Expression constantExpression = new ConstantExpression(99.0);
        assertEquals("99.0", constantExpression.toString());
    }

    /**
     * Tests the string representation of an addition expression.
     */
    @Test
    public void testAddExpressionToString() {
        Expression constant1 = new ConstantExpression(5.0);
        Expression constant2 = new ConstantExpression(2.0);
        Expression addExpression = new Addition(constant1, constant2);
        assertEquals("(5.0 + 2.0)", addExpression.toString());
    }

    /**
     * Tests the string representation of a nested addition expression.
     */
    @Test
    public void testNestedAddExpressionToString() {
        Expression constant1 = new ConstantExpression(3.0);
        Expression constant2 = new ConstantExpression(6.0);
        Expression constant3 = new ConstantExpression(1.0);
        Expression addExpression1 = new Addition(constant1, constant2);
        Expression addExpression2 = new Addition(addExpression1, constant3);
        assertEquals("((3.0 + 6.0) + 1.0)", addExpression2.toString());
    }

    /**
     * Tests the string representation of a complex expression involving addition.
     */
    @Test
    public void testComplexExpressionToString() {
        Expression constant1 = new ConstantExpression(8.0);
        Expression constant2 = new ConstantExpression(4.0);
        Expression constant3 = new ConstantExpression(12.0);
        Expression addExpression1 = new Addition(constant1, constant2);
        Expression addExpression2 = new Addition(addExpression1, constant3);
        Expression constant4 = new ConstantExpression(3.0);
        Expression addExpression3 = new Addition(addExpression2, constant4);
        assertEquals("(((8.0 + 4.0) + 12.0) + 3.0)", addExpression3.toString());
    }
}
