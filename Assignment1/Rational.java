public class Rational {

    private int numerator;
    private int denominator;

    // constructor
    public Rational() {
        numerator = 0;
        denominator = 1;
    }
    
    public Rational(int i) {
        numerator = i;
        denominator = 1;
    }
    
    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
    }
    
    // getters
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    // setters
    public void setNumerator(int n) {
        numerator = n;
    }
    
    public void setDenominator(int n) {
        denominator = n;
    }
    
    // invert void
    public void invert() {
        int n = numerator;
        numerator = denominator;
        denominator = n;
    }
    
    
    // decimal coverter
    public double toDecimal() {
        double n = (double)numerator / (double)denominator;
        return n;
    }
    
    // to string
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    
    // bonus reduce
    public void reduce() {
    int i;
    if (numerator > denominator) {
        i = numerator / 2;
    }
    else
        i = denominator / 2;
        while (i > 0) {
            if (denominator % i == 0 && numerator % i == 0) {
                numerator /= i;
                denominator /= i;
                break;
            }
            i--;
        }
        
    }
}