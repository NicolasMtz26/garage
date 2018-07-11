package fr.garage.moteur;

public class MoteurElectrique extends Moteur {
    public MoteurElectrique(String cylindre, double prix) {
        super(cylindre, prix);
        setType(TypeMoteur.ELECTRIQUE);
    }
}
