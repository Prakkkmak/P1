package com.company.arith;

import java.util.HashMap;
import java.util.Map;

public abstract class Expression {
    @Override
    public abstract String toString();
    public Expression eval() {
        return eval(new HashMap<String, Expression>());
    }
    public Expression eval(Map<String, Expression> registre) {
        return this;
    }
}
