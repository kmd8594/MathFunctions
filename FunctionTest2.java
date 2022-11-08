import functions.*;
/**
 * Test cases that prints out the functions and results
 *
 * @author Kaitlyn DeCola
 */
public class FunctionTest2 {
    /**
     * main function
     * @param args : not used
     * */
    public static void main(String[] args){
        Variable var = Variable.X;
        Function a = new Sum(var, var,new Constant(18));
        System.out.println( a + " integral from 0 to 10: " + a.integral(0,10,0));
        System.out.println();
        Function b = new Product(var, var, new Constant(5.5));
        System.out.println("Product: " + b);
        System.out.println("Is constant?: " + b.isConstant());
        System.out.println("Evaluate at x = 0: " + b.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + b.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + b.evaluate(100));
        System.out.println("Derivative: " + b.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + b.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + b.integral(0,10,10000));
        System.out.println();
        Function c = new Sine(new Product(var, new Constant(10)));
        System.out.println("Sine: " + c);
        System.out.println("Is constant?: " + c.isConstant());
        System.out.println("Evaluate at x = 0: " + c.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + c.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + c.evaluate(100));
        System.out.println("Derivative: " + c.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + c.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + c.integral(0,10,10000));
        System.out.println();
        Function d = new Cosine(new Product(var, new Constant(10)));
        System.out.println("Cosine: " + d);
        System.out.println("Is constant?: " + d.isConstant());
        System.out.println("Evaluate at x = 0: " + d.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + d.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + d.evaluate(100));
        System.out.println("Derivative: " + d.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + d.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + d.integral(0,10,10000));
        System.out.println();
        Function e = new Product(new Sum(var, new Constant(4)), new Sum(var, new Constant(2.5)));
        System.out.println("Sum within Product: " + e);
        System.out.println("Is constant?: " + e.isConstant());
        System.out.println("Evaluate at x = 0: " + e.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + e.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + e.evaluate(100));
        System.out.println("Derivative: " + e.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + e.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + e.integral(0,10,10000));
        System.out.println();
        Function f = new Sine(new Product(new Sum(var, new Constant(8)), new Product(var, new Constant(2))));
        System.out.println("Sum and product inside a product inside sine: " + f);
        System.out.println("Is constant?: " + f.isConstant());
        System.out.println("Evaluate at x = 0: " + f.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + f.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + f.evaluate(100));
        System.out.println("Derivative: " + f.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + f.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + f.integral(0,10,10000));
        System.out.println();
        Function g = new Product(var, new Product(var, new Cosine(new Product(var, new Constant(10.5)))));
        System.out.println("Product of variable and cosine: " + g);
        System.out.println("Is constant?: " +g.isConstant());
        System.out.println("Evaluate at x = 0: " + g.evaluate(0));
        System.out.println("Evaluate at x = 2.5: " + g.evaluate(2.5));
        System.out.println("Evaluate at x = 100: " + g.evaluate(100));
        System.out.println("Derivative: " + g.derivative());
        System.out.println("Integral from 0 to 10 with 100 Trapezoids: " + g.integral(0,10,100));
        System.out.println("Integral from 0 to 10 with 10000 Trapezoids: " + g.integral(0,10,10000));

    }
}
