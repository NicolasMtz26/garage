package fr.garage.options;

import fr.garage.OptionVehicule;

public class GPS implements OptionVehicule {
    @Override
    public double getPrice() {
        return 50;
    }
}
