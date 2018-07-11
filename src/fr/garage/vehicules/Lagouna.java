package fr.garage.vehicules;

import fr.garage.Marque;
import fr.garage.OptionVehicule;
import fr.garage.Vehicule;

import java.util.ArrayList;

public class Lagouna extends Vehicule {
    private Marque marque = Marque.RENO;
    private String modele = "Lagouna";
    private double price = 10;
    private ArrayList<OptionVehicule> options;


    public Lagouna() {
        super();
        setMarque(marque);
        setModele(modele);
        setPrice(price);
    }
}
