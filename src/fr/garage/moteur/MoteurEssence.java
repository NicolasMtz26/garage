package fr.garage.moteur;

public class MoteurEssence extends Moteur {
    public MoteurEssence(String cylindre, double prix) {
        super(cylindre, prix);
        setType(TypeMoteur.ESSENCE);
    }
}
