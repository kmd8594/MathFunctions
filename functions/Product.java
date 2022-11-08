package functions;
import java.util.ArrayList;

/**
 * Class of Product that extends the Function abstract class. Represents a product function
 * an arraylist of the function terms
 *
 * @author Kaitlyn DeCola
 */

public class Product extends Function {
    private ArrayList<Function> terms;
    public Product(ArrayList<Function> terms){
        double acc = 1;
        this.terms = new ArrayList<>();
        ArrayList<Function> newTerm = new ArrayList<>();
        for (Function elem : terms){
            if(elem.isConstant()){
                acc *= elem.evaluate(0);
            }
            else{
                newTerm.add(elem);
            }
        }
        if (acc != 1){
            newTerm.add(new Constant(acc));
        }

        if(acc == 0){
            Function c = new Constant (0);
            this.terms.add(c);
        }
        else {
            this.terms = newTerm;
        }


    }
    public Product(Function...terms){
        double acc = 1;
        this.terms = new ArrayList<>();
        ArrayList<Function> newTerm = new ArrayList<>();
        for (Function elem : terms){
            if(elem.isConstant()){
                acc *= elem.evaluate(0);
            }
            else{
                newTerm.add(elem);
            }
        }
        if (acc != 1){
            newTerm.add(new Constant(acc));
        }
        if(acc == 0){
            Function c = new Constant (0);
            this.terms.add(c);
        }
        else {
            this.terms = newTerm;
        }
    }
    /** Evaluates the function at x
     * @param x : the double value to be evaluated at
     * */
    public double evaluate(double x){
        double acc = 1;
        for(Function elem : terms) {
            acc *= elem.evaluate(x);
        }
        return acc;
    }
    /** to string method*/
    public String toString() {
        String st = "";
        if (terms.size() == 1){
            return terms.get(0).toString();
        }
        for (Function elem:terms){
            st += elem.toString() + " * ";
        }
        return "( " + st.substring(0, st.length()-2) + ")";
    }
    /** method that finds the derivative of the function with respect to x using the product rule*/
    public Function derivative() {
        if (terms.size() == 1) {
            return terms.get(0).derivative();
        }
        else {
            ArrayList<Function> newTerms = new ArrayList<>();
            ArrayList<Function> rest = new ArrayList<>();
            newTerms.add(terms.get(0).derivative());
                for (int i = 1; i < terms.size(); i++) {
                    newTerms.add(terms.get(i));
                    rest.add(terms.get(i));
                }
                if(terms.get(0).isConstant()){
                        return new Product(terms.get(0), new Product(rest).derivative());
                    }
            return new Sum(new Product(newTerms), new Product(terms.get(0), new Product(rest).derivative()));
            }
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
}
