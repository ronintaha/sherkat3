package edareh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetVacationDao {
    public static void getVacationDao(){
        DBHandler dbHandler = new DBHandler();
        String gSQL = ("SELECT * FROM VACATION ORDER BY id DESC LIMIT 1;");
        try(Connection connection = dbHandler.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeQuery(gSQL);
            ResultSet resultSet=statement.getResultSet();
            if (resultSet.next()){
                String first = resultSet.getString("LastN");
                String second = resultSet.getString("VacationDay");
                String third = resultSet.getString("confirm");
                System.out.println("Mr "+first+" your vacation in "+second+" om has "+third);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
