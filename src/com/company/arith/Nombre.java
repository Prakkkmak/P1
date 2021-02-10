package com.company.arith;

public class Nombre extends Expression {
    private double val;
    public Nombre(double val){
        this.val = val;
    }

    public double getVal(){
        return val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

}
