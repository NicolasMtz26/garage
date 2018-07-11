package fr.garage;

import fr.garage.options.OptionVehicule;
import fr.garage.vehicules.Vehicule;

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
        return "Garage :\n\t" +
                "voitures=" + voitures +
                '}';
    }

    public void getInfo(){
        for (Vehicule vehicule: voitures
             ) {
            System.out.println(vehicule.getMarque() +"\n\t" + vehicule.getModele() + "\n\t" + vehicule.getPrice() + "€ \n\t");
            for (OptionVehicule option: vehicule.getOptions()
                 ) {
                System.out.println("\t" + option.toString());
            }
        }
    }
}
