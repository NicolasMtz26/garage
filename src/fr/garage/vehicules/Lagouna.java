package fr.garage.vehicules;

import fr.garage.Marque;
import fr.garage.OptionVehicule;
import fr.garage.Vehicule;

import java.util.ArrayList;

public class Lagouna extends Vehicule {

    public Lagouna() {
        super();
        setMarque(Marque.RENO);
        setModele("Lagouna");
        setPrice(10);
    }
}
