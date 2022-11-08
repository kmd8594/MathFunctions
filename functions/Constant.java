package functions;

/**
 * Class of Constant that extends the Function abstract class. Represents a constant value
 * with a double value.
 *
 * @author Kaitlyn DeCola
 */
public class Constant extends Function {
    private double val;
    public Constant(double val){
        this.val = val;
    }
    /** Evaluates the constant at x - returns the value of constant
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x){
        return val;
    }
    /** to string method*/
    public String toString(){
        return Double.toString(val);
    }
    /** method that finds the derivative of the function with respect to x - returns zero*/
    public Function derivative(){
        return new Constant(0);
    }
    /** method that returns true because the function is constant*/
    public boolean isConstant() {
        return true;
    }
    /** overrides the super method and find the integral of the closed form of the function
     * @param a : upper bounds
     * @param b : lower bounds
     * @param trap : not used
     * */
    @Override
    public double integral(double a, double b, int trap){
        Function func = new Product(this, Variable.X);
        double evalA = func.evaluate(a);
        double evalB = func.evaluate(b);
        return evalB - evalA;
    }

}
