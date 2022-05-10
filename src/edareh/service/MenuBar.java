package edareh.service;

import java.util.Scanner;

import static edareh.service.MenusOption.*;

public class MenuBar {
    public static void menu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("WELCOME\n\n");

        System.out.println("Press '1' for insert your information ");
        System.out.println("Press '2' for search your person ");
        System.out.println("press '3' for leave request \n");
        System.out.print("Please select : ");
        int number = scanner.nextInt();


            switch (number){

                case 1 :
                    personelInput();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    leaveRequest();
                    break;
                default:
                    System.out.println("select invalid");

            }
        }



    }

}
