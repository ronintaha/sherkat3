package edareh.dao;

import edareh.entity.PersonelData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDao {
    public void edit(){
        DBHandler dbHandler = new DBHandler();
        PersonelData personelData = new PersonelData();
        String nSQL = "UPDATE PERSONEL SET FIRSTNAME = ? WHERE NATIONALCODE = ?";
        try(Connection connection = dbHandler.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(nSQL);
            preparedStatement.setString(1,personelData.getName());
            preparedStatement.setString(2, personelData.getId());


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
