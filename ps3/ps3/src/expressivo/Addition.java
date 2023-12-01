package expressivo;

/**
 * Represents an addition expression in the expression hierarchy.
 */
public class Addition implements Expression {
    private final Expression firstTerm;
    private final Expression secondTerm;

    /**
     * Constructs an Addition expression with given terms.
     *
     * @param firstTerm  The first term of the addition.
     * @param secondTerm The second term of the addition.
     * @throws IllegalArgumentException if either term is null.
     */
    public Addition(Expression firstTerm, Expression secondTerm) {
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;

        checkRepresentation();
    }

    private void checkRepresentation() {
        if (firstTerm == null || secondTerm == null) {
            throw new IllegalArgumentException("Addition terms cannot be null");
        }
    }

    /**
     * Returns the string representation of the addition expression.
     *
     * @return A string representation of the addition expression.
     */
    @Override
    public String toString() {
        return "(" + firstTerm.toString() + " + " + secondTerm.toString() + ")";
    }

    /**
     * Checks whether this addition expression is equal to another object.
     *
     * @param obj The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Addition other = (Addition) obj;

        return firstTerm.equals(other.firstTerm) && secondTerm.equals(other.secondTerm);
    }

    /**
     * Computes the hash code for the addition expression.
     *
     * @return The hash code for the addition expression.
     */
    @Override
    public int hashCode() {
        int result = firstTerm.hashCode();
        result = 31 * result + secondTerm.hashCode();
        return result;
    }
}
