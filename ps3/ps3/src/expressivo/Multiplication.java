package expressivo;


public class Multiplication implements Expression {
    private final Expression leftOperand;
    private final Expression rightOperand;


    public Multiplication(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;

        // Rep invariant: Both leftOperand and rightOperand must not be null.
        checkRep();
    }


    private void checkRep() {
        if (leftOperand == null || rightOperand == null) {
            throw new IllegalArgumentException("Multiplication operands cannot be null");
        }
    }

    @Override
    public String toString() {
        // Use parentheses for clarity and to maintain the correct order of operations
        return "(" + leftOperand.toString() + " * " + rightOperand.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Multiplication that = (Multiplication) obj;

        return leftOperand.equals(that.leftOperand) && rightOperand.equals(that.rightOperand);
    }

    @Override
    public int hashCode() {
        int result = leftOperand.hashCode();
        result = 31 * result + rightOperand.hashCode();
        return result;
    }

}
