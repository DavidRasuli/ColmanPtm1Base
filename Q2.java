

package test;

public class Q2 {
    public static double calc(String [] args) {

        Plus p1 = new Plus(
                new Div(
                        new Number(10).calculate(),
                        new Number(2).calculate()
                ),
                new Mul(
                        new Number(2).calculate(),
                        new Minus(
                                new Number(3).calculate(),
                                new Number(4).calculate()
                       ).calculate()));
        return p1.calculate();


    }
}
