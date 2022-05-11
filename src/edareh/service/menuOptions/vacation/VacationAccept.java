package edareh.service.menuOptions.vacation;

import edareh.entity.PersonelData;
import edareh.entity.VacationData;

import java.util.Scanner;

import static edareh.service.menuOptions.GUI.MenuBar.menu;

public class VacationAccept {
    public static void leaveAccept(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("please enter your manager id: (its: 1234) ");
        int mId =scanner3.nextInt();
        if (mId==1234){
            System.out.println("welcome manager: \n\n");
        }else {
            System.out.println("Wrong manager id!");
            try {
                menu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("enter '0' for check leave requests: ");
        int ii = scanner3.nextInt();
        if (ii==0){
            PersonelData personelData = new PersonelData();
            VacationData leave = new VacationData();

            System.out.println(personelData.getLasteName() +" wants to leave "+"in "+leave.getDayOfLeave()+" om");
        }else{
            System.out.println("Out of range!");
            try {
                menu();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("if you want to confirm press '0' if you dont press else :");
        int v00= scanner3.nextInt();
        if (v00==0){
            System.out.println("ok saved");
        }else {
            System.out.println("dont confirmed");
        }
    }
}
