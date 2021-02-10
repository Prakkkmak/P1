package com.company.machineAPile;

public class Push extends Instruction {
    String variable;
    Double nombre;

    public Push(String variable){
        this.variable = variable;
    }

    public Push(Double nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(Machine machine) {
        Double res = machine.getRegistre().get(variable);
        if(res != null) nombre = res;
        machine.getPile().push(nombre);
    }
    @Override
    public String toString(){
        if(nombre != null){
            return this.getClass().getSimpleName() + "(" + nombre + ")";
        }
        return this.getClass().getSimpleName() + " " + variable + "";
    }
}
