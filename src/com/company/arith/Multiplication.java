package com.company.arith;

public class Multiplication extends Terme{
    public Multiplication(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public char getSymbol() {
        return 'x';
    }

    @Override
    protected double evalDoubles(double a, double b) {
        return a * b;
    }
}
