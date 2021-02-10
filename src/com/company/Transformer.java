package com.company;

import com.company.arith.*;
import com.company.machineAPile.*;

public class Transformer {
    public void exp2map(Machine m, Expression e){
        if(e instanceof Nombre){
            m.input(new Push(((Nombre) e).getVal()));
        }
        else if(e instanceof Variable){
            m.input(new Push(((Variable) e).getVal()));
        }
        else if(e instanceof Addition){
            exp2map(m, ((Terme)e).a);
            exp2map(m, ((Terme)e).b);
            m.input(new Add());
        }
        else if(e instanceof Soustraction){
            exp2map(m, ((Terme)e).a);
            exp2map(m, ((Terme)e).b);
            m.input(new Sous());
        }
        else if(e instanceof Division){
            exp2map(m, ((Terme)e).a);
            exp2map(m, ((Terme)e).b);
            m.input(new Div());
        }
        else if(e instanceof Multiplication){
            exp2map(m, ((Terme)e).a);
            exp2map(m, ((Terme)e).b);
            m.input(new Mult());
        }
    }
}
