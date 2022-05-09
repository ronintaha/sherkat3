package edareh;

import java.util.ArrayList;
import java.util.List;

public class Leave {
    private int dayOfLeave;
    Leave(int dayOfLeave){
        this.dayOfLeave=dayOfLeave;
        leaveList1.add(this);
    }
    public static List<Leave> leaveList1 = new ArrayList<>();

    public int getDayOfLeave() {
        return dayOfLeave;
    }

    public void setDayOfLeave(int dayOfLeave) {
        this.dayOfLeave = dayOfLeave;
    }
}
