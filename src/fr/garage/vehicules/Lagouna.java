package fr.garage.vehicules;

public class Lagouna extends Vehicule {

    public Lagouna() {
        super();
        setMarque(Marque.RENO);
        setModele("Lagouna");
        setPrice(10);
    }

    @Override
    public String klaxon() {
        return "tirelipinponsurlechihuahua";
    }
}
