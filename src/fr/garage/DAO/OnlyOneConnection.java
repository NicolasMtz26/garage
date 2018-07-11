package fr.garage.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OnlyOneConnection {
        //URL de connexion
        private String url = "jdbc:mysql://localhost:3306/garage?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //Nom du user
        private String user = "root";
        //Mot de passe de l'utilisateur
        private String passwd = "nicolas26";
        //Objet Connection
        private static Connection connect;

        //Constructeur privé
        private OnlyOneConnection(){
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
        public static Connection getInstance(){
            if(connect == null){
                new OnlyOneConnection();
            }
            return connect;
        }
    }
