package fr.garage.options;

public class GPS implements OptionVehicule {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "GPS";
    }
}
