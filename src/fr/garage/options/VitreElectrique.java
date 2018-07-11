package fr.garage.options;

public class VitreElectrique implements OptionVehicule{
    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public String toString() {
        return "VitreElectrique";
    }
}
