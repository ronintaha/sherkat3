package edareh.service.menuOptions.vacation;

import edareh.entity.VacationData;
import edareh.service.menuOptions.Search;

import java.util.Scanner;

public class VacationRequest {
    public static void leaveRequestInput() throws InterruptedException {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter your lastname to login :");
        String name = scanner2.next();
        System.out.println("welcome "+ Search.getPersonByLastname(name).getName());
        System.out.println("now please enter the day you want to leave :");
        int num = scanner2.nextInt();
        VacationData leave = new VacationData();
        leave.setDayOfLeave(num);
        System.out.println("you want to leave in "+leave.getDayOfLeave()+" om");
        System.out.println("if you want to save press '0'");
        int vrod = scanner2.nextInt();
        if (vrod==0){
            System.out.println("processing...");
            Thread.sleep(1000);
            System.out.println("saved");
        }


    }
}
