package edareh;

//import static edareh.service.Inputs.leaveRequestInput;
import edareh.entity.PersonelData;

import static edareh.dao.GetVacationDao.getVacationDao;
import static edareh.dao.creatTabales.CreateTablePerson.createTableP;
import static edareh.service.menuOptions.GUI.MenuBar.menu;
import static edareh.service.menuOptions.PesonelInputs.personelInput;
//import static edareh.service.MenusOption.personelInput;
//import static edareh.dao.creats.CreatTable.createTable;
import static edareh.service.menuOptions.Search.search;
import static edareh.service.menuOptions.vacation.VacationRequest.leaveRequestInput;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {


        createTableP();
        menu();

//        personelInput();
//        search();
//        leaveRequestInput();
//        leaveAccept();
    }
}
