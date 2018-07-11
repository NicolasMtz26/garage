package fr.garage.options;

import fr.garage.OptionVehicule;

public class Climatisation implements OptionVehicule {
    @Override
    public double getPrice() {
        return 100;
    }
}
