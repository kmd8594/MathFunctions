package functions;
/**
 * The abstract class that represents all functions
 *
 * @author Kaitlyn DeCola
 */

public abstract class Function {
    /** Empty Function constructor*/
    Function(){    }
    /** abstract method that evaluates the function at x
     * @param x : the double value to be evaluated at
     * */
    public abstract double evaluate(double x);
    /** abstract to string method*/
    public abstract String toString();
    /** abstract method that finds the derivative of the function with respect to x*/
    public abstract Function derivative();
    /** Finds the integral using the trapezoidal method
     * @param a : upper bounds
     * * @param b : lower bounds
     * * @param trap : number of trapezoids
     *
     * */
    public double integral(double a, double b, int trap){
        double h = ((b-a) / trap);
        double funA = this.evaluate(a);
        double funB = this.evaluate(b);
        double area = .5 *(funA + funB);
        for(int i=1; i<trap+1; i++){
            double x = a + h * i;
            area += this.evaluate(x);
        }
        return area*h;
    }
    /** Abstract method that returns if the function is constant*/
    public abstract boolean isConstant();
}
