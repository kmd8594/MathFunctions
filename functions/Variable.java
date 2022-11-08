package functions;
/**
 * Class of Variable that extends the Function abstract class. Represents the variable, X
 *
 * @author Kaitlyn DeCola
 */

public class Variable extends Function {
    private Variable(){};
    public final static Variable X = new Variable();
    /** Evaluates the function at x - returns the param
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x){
        return x;
    }
    /** to string method*/
    public String toString(){
        return "X";
    }
    /** method that finds the derivative of the function with respect to x - returns one*/
    public Function derivative(){
        return new Constant(1);
    }
    /** method that returns false because the function is a variable - not constant*/
    public boolean isConstant() {
        return false;
    }
    /** overrides the super method and find the integral of the closed form of the function
     * @param a : upper bounds
     * @param b : lower bounds
     * @param trap : not used
     * */
    @Override
    public double integral(double a, double b, int trap){
        Function func = new Product(Variable.X, Variable.X, new Constant(.5));
        Double evalA = func.evaluate(a);
        Double evalB = func.evaluate(b);
        return evalB - evalA;
    }
}
