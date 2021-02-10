package com.company.arith;

public class Main {

    public static void main(String[] args) {
        Expression e1 = new Division(new Nombre(7), new Nombre(2));
        Expression e2 = new Addition(e1, new Variable("a"));
        System.out.println(e2.eval());
    }
}
