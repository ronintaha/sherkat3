package edareh;

import edareh.dao.DataBase;
import edareh.entity.PersonelData;

import java.sql.*;
import java.util.Scanner;

public class MenusOption {
    static String name1;
    static String lastname;
    static int age;
    static int id;
    static int num;
   public static void personelInput() throws InterruptedException {

       System.out.println("please enter your information");
       Scanner scanner = new Scanner(System.in);

       System.out.println("your name?");
       name1 = scanner.next();
       System.out.println("your lastname?");
       lastname = scanner.next();
       System.out.println("your age?");
       age = scanner.nextInt();
       System.out.println("your ID?");
       id = scanner.nextInt();
       System.out.println("your information :");

       PersonelData personelData = new PersonelData(name1, lastname, age, id);
       System.out.println(personelData.getName() + "\t" + personelData.getLasteName() + "\t" + personelData.getAge() + "\t" + personelData.getId());

       System.out.println("if you want to continue press '0' :");
       int cunt = scanner.nextInt();
       if (cunt == 0) {
           System.out.println("processing...");
           Thread.sleep(1000);

       }
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName(DataBase.DB_driver);


           connection = DriverManager.getConnection(DataBase.DB_url, DataBase.DB_userName, DataBase.DB_pass);
           statement = connection.createStatement();

           String sql = "insert into REGISTRATION1 "
                   + " (ID,LAST1, FIRST1 , AGE)" + " values (?,?, ?, ?)";


           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, String.valueOf(id));
           preparedStatement.setString(2, lastname);
           preparedStatement.setString(3, name1);
           preparedStatement.setString(4, String.valueOf(age));
           statement.executeUpdate(sql);
           statement.cancel();
           connection.close();

       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }finally {
           try {
               if (statement != null) {
                   statement.close();
               }
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
           try {
               if (connection != null) {
                   connection.close();
               }
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
   }

    public static void search(){
       Scanner scanner1 = new Scanner(System.in);
        System.out.println("please enter the ID of person you want :");
        int id = scanner1.nextInt();
        System.out.println(PersonelData.getPersonByID(id).getName()+" is here!");
    }
    public static void leaveRequest() throws InterruptedException {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter your lastname to login :");
        String name = scanner2.next();
        System.out.println("welcome "+PersonelData.getPersonByLastname(name).getName());
        System.out.println("now please enter the day you want to leave :");
         num = scanner2.nextInt();
        Leave leave = new Leave(num);
        System.out.println("you want to leave in "+leave.getDayOfLeave()+" om");
        System.out.println("if you want to save press '0'");
        int vrod = scanner2.nextInt();
        if (vrod==0){
            System.out.println("processing...");
            Thread.sleep(1000);
            System.out.println("saved");
        }


    }
    public static void leaveAccept(){
       Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter your manager id: (its: 1234) ");
        int mId =scanner3.nextInt();
        if (mId==1234){
            System.out.println("welcome manager: \n\n");
        }
        System.out.println("enter '0' for check leave requests: ");
        int i0 = scanner3.nextInt();
        if (i0==0){
            PersonelData personelData = new PersonelData(name1,lastname,age,id);
            Leave leave = new Leave(num);

            System.out.println(personelData.getName()+" wants to leave "+"in "+leave.getDayOfLeave()+" om");
        }
        System.out.println("if you want to confirm press '0' if you dont press '1':");
        int v00= scanner3.nextInt();
        if (v00==0){
            System.out.println("ok saved");
        }else {
            System.out.println("dont confirmed");
        }
    }
}
