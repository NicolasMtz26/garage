package fr.garage.vehicules;

import fr.garage.moteur.Moteur;
import fr.garage.options.OptionVehicule;

import java.util.ArrayList;

public abstract class Vehicule {

    private Marque marque;
    private String modele;
    private double price;
    private ArrayList<OptionVehicule> options = new ArrayList<OptionVehicule>();
    private Moteur moteur;

    public Vehicule() {
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<OptionVehicule> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<OptionVehicule> options) {
        this.options = options;
    }

    public void addOption(OptionVehicule option){
        options.add(option);
    }

    public void setMoteur(Moteur moteur){
        this.moteur = moteur;
    }

    public abstract String klaxon();

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque=" + marque +
                ", modele='" + modele + '\'' +
                ", price=" + price +
                ", options=" + options +
                '}';
    }
}
