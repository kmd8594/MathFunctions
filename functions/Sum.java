package functions;
import java.util.ArrayList;
/**
 * Class of Sum that extends the Function abstract class. Represents a sum function
 * an arraylist of the function terms
 *
 * @author Kaitlyn DeCola
 */


public class Sum extends Function {
    private ArrayList<Function> terms;
    public Sum(ArrayList<Function> terms){
        double acc = 0;
        boolean accChanged = false;
        ArrayList<Function> newTerm = new ArrayList<>();
        for (Function elem : terms){
            if(elem.isConstant()){
                accChanged = true;
                acc += elem.evaluate(0);
            }
            else{
                newTerm.add(elem);
            }
        }
        if (accChanged){
            newTerm.add(new Constant(acc));
        }
        this.terms = newTerm;
    }
    public Sum( Function... terms){
        ArrayList<Function> newArray = new ArrayList<>();
        double acc = 0;
        boolean accChanged = false;
        for(int i = 0; i<terms.length; i++) {
            if (terms[i].isConstant()) {
                accChanged = true;
                acc += terms[i].evaluate(0);
            } else {
                newArray.add(terms[i]);
            }
        }
            if(accChanged){
                newArray.add(new Constant(acc));
            }
        this.terms = newArray;
    }
    /** Evaluates the function at x
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x){
        double acc = 0;
        for(Function elem : terms) {
                acc += elem.evaluate(x);
        }
        return acc;
    }
    /** to string method*/
    public String toString(){
        if(terms.size() == 0){
            return "";
        }
        if (terms.size() == 1){
            return terms.get(0).toString();
        }
        if (terms.size() == 2){
            return "( " + terms.get(0).toString() + " + " + terms.get(1).toString() + " )";
        }
        String st = "";
        for (Function elem : terms){
            st += elem.toString() + " + ";
        }
        return "( " + st.substring(0, st.length()-2) + ")";
    }
    /** method that finds the derivative of the function with respect to x*/
    public Function derivative(){
        ArrayList<Function> der = new ArrayList<>();
        for(Function elem : terms){
            der.add(elem.derivative());
        }
        return new Sum(der);
    }
    /** method that returns if the function is constant*/
    public boolean isConstant(){
        for(Function elem : terms){
            if (!elem.isConstant()){
                return false;
            }
        }
        return true;
    }
    /** overrides the super method and find the integral of the closed form of the function
     * @param a : upper bounds
     * @param b : lower bounds
     * @param trap : not used
     * */
    @Override
    public double integral(double a, double b, int trap){
        double acc = 0;
        for (Function elem : terms){
            acc += elem.integral(a,b,trap);
        }
        return acc;
    }
}


