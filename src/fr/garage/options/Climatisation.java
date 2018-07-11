package fr.garage.options;

public class Climatisation implements OptionVehicule {
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String toString() {
        return "Climatisation";
    }
}
