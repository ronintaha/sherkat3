package edareh.service.menuOptions.vacation;

import edareh.entity.VacationData;

import java.util.Scanner;

import static edareh.dao.GetVacationDao.getVacationDao;

public class CheckVacation {
    public static void checkVacation() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        VacationData vacationData = new VacationData();
        System.out.println("please enter your national code : ");
        int ncode = scanner.nextInt();
        getVacationDao(ncode);
        System.out.println("Mr "+vacationData.getlName()+" your vacation request has "+vacationData.getConfirm());
        Thread.sleep(500);



    }
}
