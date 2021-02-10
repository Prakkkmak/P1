package com.company.arith;

import java.util.Map;

public class Variable extends Expression{

    private final String val;

    public Variable(String val){
        this.val = val;
    }

    public String getVal(){
        return val;
    }

    @Override
    public String toString() {
        return val;
    }

    @Override
    public Expression eval(Map<String, Expression> registre){
        Expression res = registre.get(val);
        return res == null ? this : res;
    }
}
