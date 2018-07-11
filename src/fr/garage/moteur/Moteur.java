package fr.garage.moteur;

public class Moteur {

    private TypeMoteur type;
    private String cylindre;
    private double prix;

    public Moteur(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public TypeMoteur getType() {
        return type;
    }

    public void setType(TypeMoteur type) {
        this.type = type;
    }

    public String getCylindre() {
        return cylindre;
    }

    public void setCylindre(String cylindre) {
        this.cylindre = cylindre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "type=" + type +
                ", cylindre='" + cylindre + '\'' +
                ", prix=" + prix +
                '}';
    }
}
