package com.codecool.farm.animal;

// Amikor megetetik mérete 2-vel növekszik.

public class Cattle extends Animal {

    @Override
    public void feed() {
        super.feed();
        this.size += 2;
    }
}
