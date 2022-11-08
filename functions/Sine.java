package functions;
/**
 * Class of Sine that extends the Function abstract class. Represents a cosine function
 * with the terms inside being functions
 *
 * @author Kaitlyn DeCola
 */

public class Sine extends Function {
    private Function terms;

    public Sine(Function terms) {
        this.terms = terms;
    }
    /** Evaluates the function at x
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x) {
        double term = terms.evaluate(x);
        return Math.sin(term);
    }
    /** to string method*/
    public String toString() {
        return "sin( " + terms.toString() + " )";
    }
    /** method that finds the derivative of the function with respect to x*/
    public Function derivative() {
        return new Product(new Cosine(terms), terms.derivative());
    }
    /** method that returns if the function is constant*/
    public boolean isConstant() {
        return terms.isConstant();
    }
}
