import functions.*;
/**
 * Test cases that prints out the functions and results
 *
 * @author Kaitlyn DeCola
 */

public class FunctionTest1 {
    /**
     * main function
     * @param args : not used
     * */
    public static void main(String[] args){
        Variable var = Variable.X;
        Constant constant = new Constant(5);
        System.out.println("Constant: " + constant);
        System.out.println("Is constant?: " + constant.isConstant());
        System.out.println("Evaluate at x = 0: " + constant.evaluate(0));
        System.out.println("Derivative: " + constant.derivative());
        System.out.println();
        System.out.println("Variable: " + var);
        System.out.println("Is constant?: " + var.isConstant());
        System.out.println("Evaluate at x = 0: " + var.evaluate(0));
        System.out.println("Derivative: " + var.derivative());
        System.out.println();
        Sum sum = new Sum(new Constant(7), var);
        System.out.println("Sum:" + sum);
        System.out.println("Is Constant?: " + sum.isConstant());
        System.out.println("Evaluate at x = 0: " + sum.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + sum.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + sum.evaluate(100));
        System.out.println("Derivative: " + sum.derivative());
        System.out.println();
        Sum sum2 = new Sum(var, var);
        System.out.println("Sum with multiple variables: " + sum2);
        System.out.println("Is Constant?: " + sum2.isConstant());
        System.out.println("Evaluate at x = 0: " + sum2.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + sum2.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + sum2.evaluate(100));
        System.out.println("Derivative: " +sum2.derivative());
        System.out.println();
        Sum sum3 = new Sum(var, var, new Constant(15.5));
        System.out.println("Sum with multiple variables and a constant: " + sum3);
        System.out.println("Is Constant?: " + sum3.isConstant());
        System.out.println("Evaluate at x = 0: " + sum3.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + sum3.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + sum3.evaluate(100));
        System.out.println("Derivative: " +sum3.derivative());
        System.out.println();
        Sum sum4 = new Sum(var, new Sum(var, var, new Constant(7)), new Sum(var, new Constant(18)), var, new Constant(5));
        System.out.println("A sum within a sum: " + sum4);
        System.out.println("Is Constant?: " + sum4.isConstant());
        System.out.println("Evaluate at x = 0: " + sum4.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + sum4.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + sum4.evaluate(100));
        System.out.println("Derivative: " +sum4.derivative());
        System.out.println();
    }
}
