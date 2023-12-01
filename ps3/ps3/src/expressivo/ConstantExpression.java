package expressivo;


public class ConstantExpression implements Expression {
    private final double value;


    public ConstantExpression(double value) {
        this.value = value;

        // Rep invariant: None for a constant expression.
        checkRep();
    }



    private void checkRep() {

    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ConstantExpression that = (ConstantExpression) obj;

        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }


}
