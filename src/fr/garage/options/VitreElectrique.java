package fr.garage.options;

import fr.garage.OptionVehicule;

public class VitreElectrique implements OptionVehicule{
    @Override
    public double getPrice() {
        return 20;
    }
}
