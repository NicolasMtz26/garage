package fr.garage.options;

public class BarreDeToit implements OptionVehicule {
    @Override
    public double getPrice() {
        return 80;
    }

    @Override
    public String toString() {
        return "BarreDeToit";
    }
}
