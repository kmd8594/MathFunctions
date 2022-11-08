package functions;
/**
 * Class of Cosine that extends the Function abstract class. Represents a cosine function
 * with the terms inside being functions
 *
 * @author Kaitlyn DeCola
 */
public class Cosine extends Function {
    private Function terms;
    public Cosine(Function terms){
        this.terms = terms;
    }
    /** Evaluates the function at x
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x){
        double term = terms.evaluate(x);
        return Math.cos(term);
    }
    /** to string method*/
    public String toString(){
        return "cos( " + terms.toString() + " )";
    }
    /** amethod that finds the derivative of the function with respect to x*/
    public Function derivative(){
        return new Product(new Constant(-1), new Sine(terms), terms.derivative());
    }
    /** method that returns if the function is constant*/
    public boolean isConstant(){
        return terms.isConstant();
    }
}

