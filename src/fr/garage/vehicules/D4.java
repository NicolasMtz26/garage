package fr.garage.vehicules;

import fr.garage.Marque;
import fr.garage.OptionVehicule;
import fr.garage.Vehicule;

import java.util.ArrayList;

public class D4 extends Vehicule {
    private Marque marque;
    private String modele;
    private double price;
    private ArrayList<OptionVehicule> options;


    public D4() {
        super();
        setMarque(marque);
        setModele(modele);
        setPrice(price);
    }

//
//    public D4() {
//      super();
//    }
}
