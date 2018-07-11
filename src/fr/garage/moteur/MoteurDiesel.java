package fr.garage.moteur;

public class MoteurDiesel extends Moteur {
    public MoteurDiesel(String cylindre, double prix) {
        super(cylindre, prix);
        setType(TypeMoteur.DIESEL);
    }
}
