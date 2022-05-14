package edareh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetInformation {
    public static void getInformation(){
        DBHandler dbHandler = new DBHandler();
        String iSQL = ("SELECT * FROM PERSONEL1 ORDER BY id DESC LIMIT 1 ;");
        try (Connection connection = dbHandler.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeQuery(iSQL);
            ResultSet resultSet = statement.getResultSet();
           String name = resultSet.getString("FIRSTNAME");
           String last =  resultSet.getString("LASTNAME");
           String age =  resultSet.getString("AGE");
            System.out.println("Information of person you want is : "+name+""+last+""+age);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
