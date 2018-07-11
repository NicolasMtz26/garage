package fr.garage.options;

public class SiegeChauffant implements OptionVehicule {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "SiegeChauffant";
    }
}
