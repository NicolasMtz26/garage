package fr.garage.moteur;

public class MoteurHybride extends Moteur {

    public MoteurHybride(String cylindre, double prix) {
        super(cylindre, prix);
        setType(TypeMoteur.HYBRIDE);
    }
}
