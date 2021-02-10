package com.company.machineAPile;

import java.util.*;

public class Machine {
    private final Deque<Double> pile;
    private final Map<String, Double> registre;
    private final List<Instruction> instructions;
    public Machine(){
        pile = new ArrayDeque<>();
        registre = new HashMap<>();
        instructions = new ArrayList<>();
    }

    public void store(String key, Double val){
        registre.put(key, val);
    }

    public void input(Instruction i){
        instructions.add(i);
    }

    public Deque<Double> getPile(){ return pile; }

    public Map<String, Double> getRegistre() {
        return registre;
    }

    public void run(){
        for (Instruction instruction : instructions) {
            System.out.println("RUN " + instruction);
            instruction.run(this);
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Machine{" +
                "pile=" + pile +
                ", registre=" + registre +
                ", instructions=" + instructions +
                '}';
    }

}
