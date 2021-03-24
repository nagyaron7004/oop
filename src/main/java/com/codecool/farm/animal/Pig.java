package com.codecool.farm.animal;
// Amikor megetetik mérete 1-el növekszik.
public class Pig extends Animal {

    @Override
    public void feed() {
        super.feed();
        this.size ++;
    }
}
