package com.codecool.farm;

// Tartalmaz egy boolean canButcher(Animal animal) metódust ami visszaadja,
// hogy a paraméterben megadott állat levágható-e. Egy állatot akkor lehet levágni
// ha mérete nagyobb 4 egységnél.

import com.codecool.farm.animal.Animal;

class Butcher {

    public boolean canButcher(Animal animal) {
        return animal.getSize() > 4 ? true : false;
    }

}
