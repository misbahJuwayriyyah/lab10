package expressivo;

/**
 * Represents a multiplication expression in the expression hierarchy.
 */
public class Multiplication implements Expression {
    private final Expression factor1;
    private final Expression factor2;

    /**
     * Constructs a Multiplication expression with given factors.
     *
     * @param factor1 The first factor of the multiplication.
     * @param factor2 The second factor of the multiplication.
     * @throws IllegalArgumentException if either factor is null.
     */
    public Multiplication(Expression factor1, Expression factor2) {
        this.factor1 = factor1;
        this.factor2 = factor2;

        validateRepresentation();
    }

    private void validateRepresentation() {
        if (factor1 == null || factor2 == null) {
            throw new IllegalArgumentException("Multiplication factors cannot be null");
        }
    }

    /**
     * Returns the string representation of the multiplication expression.
     *
     * @return A string representation of the multiplication expression.
     */
    @Override
    public String toString() {
        return "(" + factor1.toString() + " * " + factor2.toString() + ")";
    }

    /**
     * Checks whether this multiplication expression is equal to another object.
     *
     * @param obj The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Multiplication other = (Multiplication) obj;

        return factor1.equals(other.factor1) && factor2.equals(other.factor2);
    }

    /**
     * Computes the hash code for the multiplication expression.
     *
     * @return The hash code for the multiplication expression.
     */
    @Override
    public int hashCode() {
        int result = factor1.hashCode();
        result = 31 * result + factor2.hashCode();
        return result;
    }
}
