package fr.garage.vehicules;

import fr.garage.Marque;
import fr.garage.OptionVehicule;
import fr.garage.Vehicule;

import java.util.ArrayList;

public class A300B extends Vehicule {


    public A300B() {
        super();
        setMarque(Marque.PIGEOT);
        setModele("A300B");
        setPrice(10);
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
