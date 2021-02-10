package com.company.arith;

import java.util.Map;

public abstract class Terme extends Expression implements Cloneable {
    public Expression a;
    public Expression b;

    public Terme(Expression a, Expression b){
        this.a = a;
        this.b = b;
    }

    public abstract char getSymbol();

    @Override
    public String toString(){
        return '(' + a.toString() + " " + getSymbol() + " " + b.toString() + ')';
    };

    @Override
    public Expression eval(Map<String, Expression> registre) {
        Expression aExpression = a.eval(registre);
        Expression bExpression = b.eval(registre);
        if(a instanceof Nombre && b instanceof Nombre){
            double aVal = ((Nombre)a).getVal();
            double bVal = ((Nombre)b).getVal();
            return new Nombre(evalDoubles(aVal,bVal));
        }
        else {
            try {
                Terme t = (Terme) this.clone();
                t.a = aExpression;
                t.b = bExpression;
                return t;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    protected abstract double evalDoubles(double a, double b);

}
