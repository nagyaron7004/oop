package com.codecool.farm.animal;

/*
* méret int size
Az állatok mérete nem állítható a constructor-al, alapértelmezetten az állat létrejöttekor 0.
A méret field-hez tartozik egy getter.
Minden állatot meg lehet etetni a feed(), ennek megvalósítása állat típusonként különböző.
*  */

public abstract class Animal {
    int size;

    public Animal(){
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void feed(){}

}
