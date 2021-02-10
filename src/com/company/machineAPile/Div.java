package com.company.machineAPile;

public class Div extends Instruction{
    @Override
    public void run(Machine machine) {
        Double a = machine.getPile().pop();
        Double b = machine.getPile().pop();
        machine.getPile().push(b / a);
    }
}
