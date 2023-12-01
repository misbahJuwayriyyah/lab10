package expressivo;

public class Multiplication implements Expression {
    private final Expression factor1;
    private final Expression factor2;

    public Multiplication(Expression factor1, Expression factor2) {
        this.factor1 = factor1;
        this.factor2 = factor2;

        validateRepresentation();
    }

    private void validateRepresentation() {
        if (factor1 == null || factor2 == null) {
            throw new IllegalArgumentException("ProductExpression factors cannot be null");
        }
    }

    @Override
    public String toString() {
        return "(" + factor1.toString() + " * " + factor2.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Multiplication other = (Multiplication) obj;

        return factor1.equals(other.factor1) && factor2.equals(other.factor2);
    }

    @Override
    public int hashCode() {
        int result = factor1.hashCode();
        result = 31 * result + factor2.hashCode();
        return result;
    }
}
