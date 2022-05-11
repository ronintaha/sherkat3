package edareh.dao.creatTabales;

import edareh.dao.DBHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableVacation {
    public static void creatTableV(){
        DBHandler dbHandler = new DBHandler();
        String vSQL = "CREATE TABLE IF NOT EXIST VACATION"+"(ID INTEGER PRIMARY KEY AUTO_INCREMENT,"+"LastN VARCHAR (255)"+"VacationDay VARCHAR(255),"+"Confirm VARCHAR(255) )";
        try (Connection connection =dbHandler.getConnection()){
            Statement statement = connection.createStatement();
            statement.executeUpdate(vSQL);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
