package expressivo;

/**
 * Represents a constant numeric expression in the expression hierarchy.
 */
public class ConstantExpression implements Expression {
    private final double value;

    /**
     * Constructs a ConstantExpression with the given numeric value.
     *
     * @param value The numeric value of the constant expression.
     */
    public ConstantExpression(double value) {
        this.value = value;

        // Rep invariant: None for a constant expression.
        validateRepresentation();
    }

    private void validateRepresentation() {
        // No specific representation validation for a constant expression
    }

    /**
     * Returns the string representation of the constant expression.
     *
     * @return A string representation of the constant expression.
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }

    /**
     * Checks whether this constant expression is equal to another object.
     *
     * @param obj The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ConstantExpression other = (ConstantExpression) obj;

        return Double.compare(other.value, value) == 0;
    }

    /**
     * Computes the hash code for the constant expression.
     *
     * @return The hash code for the constant expression.
     */
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
