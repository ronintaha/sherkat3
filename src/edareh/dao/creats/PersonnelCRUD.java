package edareh.dao.creats;

import edareh.dao.DBHandler;
import edareh.entity.PersonelData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonnelCRUD {

//    private Connection connection;

//    public PersonnelCRUD(Connection connection) {
//        this.connection = connection;
//    }
    public  void create(PersonelData personelData) {
        String FirstName = personelData.getName();
        String LastName = personelData.getLasteName();
        String AGE= personelData.getAge();

        String query = "INSERT INTO PERSONEL1 ( FIRSTNAME,LASTNAME,AGE) VALUES (?,?,?)";
        DBHandler dbHandler = new DBHandler();
        try(Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, FirstName);
            preparedStatement.setString(2, LastName);
            preparedStatement.setString(3, AGE);
             preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
