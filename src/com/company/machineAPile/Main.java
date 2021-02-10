package com.company.machineAPile;

public class Main {

    public static void main(String[] args) {
        Machine m= new Machine();
        m.store("a", 1.5);
        m.input(new Push(7.0));
        m.input(new Push(2.0));
        m.input(new Div());
        m.input(new Push("a"));
        m.input(new Add());
        System.out.println(m);
        m.run();
        System.out.println(m);
    }
}
