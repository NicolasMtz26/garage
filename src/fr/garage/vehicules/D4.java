package fr.garage.vehicules;

public class D4 extends Vehicule {
    public D4() {
        super();
        setMarque(Marque.TROEN);
        setModele("D4");
        setPrice(10);
    }

    @Override
    public String klaxon() {
        return "Tutut";
    }

//
//    public D4() {
//      super();
//    }
}
