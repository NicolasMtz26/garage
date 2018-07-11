package fr.garage;

import fr.garage.DAO.VoitureDAO;
import fr.garage.options.*;
import fr.garage.vehicules.*;
import fr.garage.moteur.*;

public class Main {
    public static void main(String[] args) {
   	 Garage garage = new Garage();
   	 VoitureDAO DAO = new VoitureDAO();
   	 System.out.println(garage);


   	 
   	 Vehicule lag1 = new Lagouna();
   	 DAO.create(lag1);
   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
   	 lag1.addOption(new GPS());
   	 lag1.addOption(new SiegeChauffant());
   	 lag1.addOption(new VitreElectrique());
   	 garage.addVoiture(lag1);
   		 
   	 Vehicule A300B_2 = new A300B();
   	 DAO.create(A300B_2);
   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
   	 A300B_2.addOption(new Climatisation());
   	 A300B_2.addOption(new BarreDeToit());
   	 A300B_2.addOption(new SiegeChauffant());
   	 garage.addVoiture(A300B_2);
   	 
   	 Vehicule d4_1 = new D4();
   	 DAO.create(d4_1);
   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
   	 d4_1.addOption(new BarreDeToit());
   	 d4_1.addOption(new Climatisation());
   	 d4_1.addOption(new GPS());
   	 garage.addVoiture(d4_1);   	 
   	 
   	 Vehicule lag2 = new Lagouna();
   	 DAO.create(lag2);
   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
   	 garage.addVoiture(lag2);
   	 
   	 Vehicule A300B_1 = new A300B();
   	 DAO.create(A300B_1);
   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
   	 A300B_1.addOption(new VitreElectrique());
   	 A300B_1.addOption(new BarreDeToit());
   	 garage.addVoiture(A300B_1);
   	 
   	 Vehicule d4_2 = new D4();
   	 DAO.create(d4_2);
   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
   	 d4_2.addOption(new SiegeChauffant());
   	 d4_2.addOption(new BarreDeToit());
   	 d4_2.addOption(new Climatisation());
   	 d4_2.addOption(new GPS());
   	 d4_2.addOption(new VitreElectrique());
   	 garage.addVoiture(d4_2);

		garage.getInfo();

		DAO.findall();
    }
}