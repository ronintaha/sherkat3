package edareh;

import java.util.Scanner;

public class MenusOption {
   public static void personelInput() throws InterruptedException {

       System.out.println("please enter your information");
       Scanner scanner = new Scanner(System.in);

       System.out.println("your name?");
       String name = scanner.next();
       System.out.println("your lastname?");
       String lastname = scanner.next();
       System.out.println("your age?");
       int age = scanner.nextInt();
       System.out.println("your ID?");
       int id = scanner.nextInt();
       System.out.println("your information :");

       PersonelData personelData = new PersonelData(name,lastname,age,id);
       System.out.println(personelData.getName()+"\t"+personelData.getLasteName()+"\t"+personelData.getAge()+"\t"+personelData.getId());

       System.out.println("if you want to continue press '0' else press '1' :");
       int cunt = scanner.nextInt();
       if (cunt==0){
           System.out.println("ok");

       }else {
           System.out.println("bye");
           Thread.sleep(1000);
       }
    }
    public static void search(){
       Scanner scanner1 = new Scanner(System.in);
        System.out.println("please enter the ID of person you want :");
        int id = scanner1.nextInt();
        System.out.println(PersonelData.getPersonByID(id).getName()+" is here!");
    }
}
