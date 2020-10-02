public class Fraction {

    private double n;
    private double d;

    public Fraction (double n, double d) {
        this.n = n;
        this.d = d;
    }

    public Fraction() {
        this(0,0);
    }

    public String toString() {
        return Double.valueOF(n).toString() + " " + Double.valueOf(d).toString();
    }
}