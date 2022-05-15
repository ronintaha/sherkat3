package edareh.dao;

import edareh.entity.PersonelData;

import java.sql.*;

public class GetInformation {
    public static void getInformation(String id){
        DBHandler dbHandler = new DBHandler();
        String iSQL = ("SELECT * FROM PERSONEL1 WHERE NATIONALCODE =? ;");

        try (Connection connection = dbHandler.getConnection()){
            PersonelData personelD = new PersonelData();

//            String nCode = personelD.getId();

            PreparedStatement preparedStatement = connection.prepareStatement(iSQL);
            preparedStatement.setString(1,id);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();


            if (resultSet.next()) {
                String name = resultSet.getString("FIRSTNAME");
                String lastName = resultSet.getString("LASTNAME");
                String age = resultSet.getString("AGE");
//            String nCode1 = resultSet.getString("NATIONALCODE");

                System.out.println("Information of person you want is : \n"+"Name : " + name +"\n" +"LastName : " +lastName+ "\n" + "Age : " + age+"\n");
            }
//            Statement statement = connection.createStatement();
//            statement.executeQuery(iSQL);
//            ResultSet resultSet = statement.getResultSet();
//           String name = resultSet.getString("FIRSTNAME");
//           String last =  resultSet.getString("LASTNAME");
//           String age =  resultSet.getString("AGE");
//            System.out.println("Information of person you want is : "+name+""+last+""+age);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
