/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;



public class ExpressionTest {



    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false;
    }
    
    
    // TODO: tests for Expression
    @Test
    public void testConstantExpressionToString() {
        Expression constantExpression = new ConstantExpression(42.0);
        assertEquals("42.0", constantExpression.toString());
    }

    @Test
    public void testAddExpressionToString() {
        Expression constant1 = new ConstantExpression(10.0);
        Expression constant2 = new ConstantExpression(1.0);
        Expression addExpression = new Addition(constant1, constant2);
        assertEquals("(10.0 + 1.0)", addExpression.toString());
    }

    @Test
    public void testNestedAddExpressionToString() {
        Expression constant1 = new ConstantExpression(9.0);
        Expression constant2 = new ConstantExpression(2.0);
        Expression constant3 = new ConstantExpression(8.0);
        Expression addExpression1 = new Addition(constant1, constant2);
        Expression addExpression2 = new Addition(addExpression1, constant3);
        assertEquals("((9.0 + 2.0) + 8.0)", addExpression2.toString());
    }

    @Test
    public void testComplexExpressionToString() {
        Expression constant1 = new ConstantExpression(11.0);
        Expression constant2 = new ConstantExpression(7.0);
        Expression constant3 = new ConstantExpression(25.0);
        Expression addExpression1 = new Addition(constant1, constant2);
        Expression addExpression2 = new Addition(addExpression1, constant3);
        Expression constant4 = new ConstantExpression(21.0);
        Expression addExpression3 = new Addition(addExpression2, constant4);
        assertEquals("(((11.0 + 7.0) + 25.0) + 21.0)", addExpression3.toString());
    }
}
