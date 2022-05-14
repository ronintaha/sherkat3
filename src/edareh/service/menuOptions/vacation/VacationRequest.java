package edareh.service.menuOptions.vacation;

import edareh.dao.VacationDao;
import edareh.entity.PersonelData;
import edareh.entity.VacationData;
import edareh.service.menuOptions.Search;

import java.util.Scanner;

import static edareh.dao.creatTabales.CreateTableVacation.creatTableVacation;
import static edareh.service.menuOptions.GUI.MenuBar.menu;
import static java.awt.SystemColor.menu;

public class VacationRequest {
    public static void leaveRequestInput() throws InterruptedException {
        creatTableVacation();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("please enter your lastname to login :");
        String name = scanner2.next();
        System.out.println("welcome "+ Search.getPersonByLastname(name).getName());
        System.out.println("now please enter the day you want to leave :");
        int num = scanner2.nextInt();
        if (num>1&&num<31){
        VacationData leave = new VacationData();
        leave.setDayOfLeave(num);
        System.out.println("you want to leave in "+leave.getDayOfLeave()+" om");
        }else {
            System.out.println("out of range");
            menu();
        }
        System.out.println("if you want to save press '0'");
        int vrod = scanner2.nextInt();
        if (vrod==0) {
            System.out.println("processing...");
            Thread.sleep(1000);

            VacationDao vacationDao = new VacationDao();
            vacationDao.insertVacation();


            System.out.println("saved");


        }


    }
}
