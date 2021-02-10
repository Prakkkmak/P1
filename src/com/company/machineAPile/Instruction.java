package com.company.machineAPile;

public abstract class Instruction {
    public abstract void run(Machine machine);
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
