package fr.garage.vehicules;

import fr.garage.Marque;
import fr.garage.OptionVehicule;
import fr.garage.Vehicule;

import java.util.ArrayList;

public class A300B extends Vehicule {
    private Marque marque;
    private String modele;
    private double price;
    private ArrayList<OptionVehicule> options;


    public A300B() {
        super();
        setMarque(marque);
        setModele(modele);
        setPrice(price);
    }
//
//    public A300B(Marque marque, String modele, double price) {
//        this.marque = marque;
//        this.modele = modele;
//        this.price = price;
//        this.options = options;
//    }
//
//    public A300B() {
//        super();
//
//    }
}
