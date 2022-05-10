package edareh;

import static edareh.service.MenuBar.menu;
import static edareh.service.MenusOption.personelInput;
import static edareh.dao.creats.CreatTable.createTable;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {



        createTable();
        menu();


//        personelInput();
//        search();
//        leaveRequest();
//        leaveAccept();
    }
}
