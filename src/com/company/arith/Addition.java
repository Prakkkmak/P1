package com.company.arith;

public class Addition extends Terme {

    public Addition(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    protected double evalDoubles(double a, double b) {
        return a + b;
    }


}
