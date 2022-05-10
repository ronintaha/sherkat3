package edareh.dao;

import edareh.entity.PersonelData;

import javax.management.loading.ClassLoaderRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
     final static String DB_driver = "org.h2.Driver";
     final static String DB_url = "jdbc:h2:tcp://localhost/~/test";
     final static String DB_userName = "sa";
     final static String DB_pass = "";
    private static Connection connectionforDataBase;
    private static Statement statementforDataBase;

    public DataBase(){
        getConnection();
        createTable();
    }

//    public static void createTable() {
//
//            Connection connection = null;
//            Statement statement = null;
//            try {
//                Class.forName(DB_driver);
//
//                System.out.println("Connecting to database ...");
//                connection = DriverManager.getConnection(DB_url, DB_userName, DB_pass);
//                Thread.sleep(500);
//                System.out.println("Creating table...");
//                Thread.sleep(500);
//              try {
//                  statement = connection.createStatement();
//
//                  String sql = "CREATE TABLE   REGISTRATION1 " + "(id INTEGER not NULL, " + " first1 VARCHAR(255), " + " last1 VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
//                  statement.executeUpdate(sql);
//                  System.out.println("Created");
//
//                  statement.cancel();
//                  connection.close();
//              }catch (Exception e){
//                  System.out.println("table already exist");
//              }
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    if (statement != null) {
//                        statement.close();
//                    }
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//                try {
//                    if (connection != null) {
//                        connection.close();
//                    }
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//    }

//    public static void insertIntoTable(){
//
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            Class.forName(DB_driver);
//            connection=DriverManager.getConnection(DB_url,DB_userName,DB_pass);
//            statement=connection.createStatement();
//            statement.executeUpdate("INSERT into REGISTRATION value ()");
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void createTable0(){

    }
    private static void getConnection(){
        try {
            Class.forName(DB_driver);
            connectionforDataBase = DriverManager.getConnection(DB_url,DB_userName,DB_pass);
            statementforDataBase = connectionforDataBase.createStatement();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void createTable(){
        String pSQL = "CREATE TABLE IF NOT EXISTS PERSONEL " + "(id INTEGER PRIMARY KEY AUTO_INCREMENT, " + " first1 VARCHAR(255), " + " last1 VARCHAR(255), " + " age VARCHAR(50) )";
        try {
            statementforDataBase.executeUpdate(pSQL);
            System.out.println("createdj");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void insertClient(PersonelData personelData,String number){
        getConnection();
        String FirstName = personelData.getName();
        String LastName = personelData.getLasteName();
        String AGE= personelData.getAge();
        String ID = number;
        String iSQL = "INSERT INTO PERSONEL ( first1,Last1,Age) VALUES ('" + FirstName + "','" + LastName + "','" + AGE + "');";
        try {
            statementforDataBase.executeUpdate(iSQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}