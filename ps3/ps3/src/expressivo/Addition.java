package expressivo;

public class Addition implements Expression {
    private final Expression firstTerm;
    private final Expression secondTerm;

    public Addition(Expression firstTerm, Expression secondTerm) {
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;

        checkRepresentation();
    }

    private void checkRepresentation() {
        if (firstTerm == null || secondTerm == null) {
            throw new IllegalArgumentException("SumExpression terms cannot be null");
        }
    }

    @Override
    public String toString() {
        return "(" + firstTerm.toString() + " + " + secondTerm.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Addition other = (Addition) obj;

        return firstTerm.equals(other.firstTerm) && secondTerm.equals(other.secondTerm);
    }

    @Override
    public int hashCode() {
        int result = firstTerm.hashCode();
        result = 31 * result + secondTerm.hashCode();
        return result;
    }
}
