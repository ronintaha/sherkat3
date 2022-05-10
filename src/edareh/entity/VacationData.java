package edareh.entity;

import java.util.ArrayList;
import java.util.List;

public class VacationData {
    private int dayOfLeave;
    public VacationData(int dayOfLeave){
        this.dayOfLeave=dayOfLeave;
        leaveList1.add(this);
    }
    public static List<VacationData> leaveList1 = new ArrayList<>();

    public int getDayOfLeave() {
        return dayOfLeave;
    }

    public void setDayOfLeave(int dayOfLeave) {
        this.dayOfLeave = dayOfLeave;
    }
}
