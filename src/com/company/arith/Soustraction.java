package com.company.arith;

public class Soustraction extends Terme{
    public Soustraction(Expression a, Expression b) {
        super(a, b);
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    protected double evalDoubles(double a, double b) {
        return a - b;
    }


}
