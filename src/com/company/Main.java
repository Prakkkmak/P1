package com.company;

import com.company.arith.*;
import com.company.machineAPile.Add;
import com.company.machineAPile.Div;
import com.company.machineAPile.Machine;
import com.company.machineAPile.Push;

public class Main {
    public static void main(String[] args) {
        Expression e1= new Division(new Nombre(7), new Nombre(2));//  (7 / 2)
        Expression e2= new Addition(e1, new Variable("a"));        // ((7 / 2) + a)
        Machine m = new Machine();
        m.store("a", 1.5);
        Transformer transformer = new Transformer();
        transformer.exp2map(m, e2);
        System.out.println(m);
        XmlLoader xmlLoader = new XmlLoader();
        Expression e = xmlLoader.loadFromXml("data/expr.xml");
        System.out.println(e);
    }
}
