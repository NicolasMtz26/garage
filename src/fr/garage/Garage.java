package fr.garage;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicule> voitures;

    public Garage() {
        this.voitures = new ArrayList<Vehicule>();
    }

    public void addVoiture(Vehicule vehicule) {
        voitures.add(vehicule);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "voitures=" + voitures +
                '}';
    }
}
