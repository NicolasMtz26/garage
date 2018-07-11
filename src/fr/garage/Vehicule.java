package fr.garage;

import java.util.ArrayList;

public class Vehicule {

    private Marque marque;
    private String modele;
    private double price;
    private ArrayList<OptionVehicule> options;

    public Vehicule() {
        this.marque = marque;
        this.modele = modele;
        this.price = price;
        this.options = options;
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
