package fr.garage.DAO;

import fr.garage.vehicules.Vehicule;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VoitureDAO {
    Connection connection = OnlyOneConnection.getInstance();

        public VoitureDAO() {
        }

        public boolean create(Vehicule vehicule) {
            try {
                PreparedStatement preparedStatement = this.connection.prepareStatement("INSERT INTO voitures (marque, modele, prix) values (?,?,?)");
                preparedStatement.setString(1, vehicule.getMarque().toString());
                preparedStatement.setString(2, vehicule.getModele());
                preparedStatement.setDouble(3, vehicule.getPrice());
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return true;
        }

        public boolean delete(Vehicule obj) {
            return false;
        }

        public boolean update(Vehicule obj) {
            return false;
        }

        public void findall() {

            try {
                PreparedStatement preparedStatement = this.connection.prepareStatement("SELECT * FROM voitures");
                ResultSet resultSet = preparedStatement.executeQuery();

//                //pour afficher 1 (findorfail)
//                if (resultSet.first())

                    //pour afficher tout
                while(resultSet.next()){
                    System.out.println(resultSet.getString("marque") + " " + resultSet.getNString("modele") + " " +resultSet.getDouble("prix") );
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
