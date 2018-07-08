package igorizm.com.tamagucci;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class Time {

    int getS() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("y");
        int y = Integer.parseInt(sdf.format(calendar.getTime()));
        sdf = new SimpleDateFormat("M");
        int m1 = Integer.parseInt(sdf.format(calendar.getTime()));
        sdf = new SimpleDateFormat("d");
        int d = Integer.parseInt(sdf.format(calendar.getTime()));
        sdf = new SimpleDateFormat("k");
        int h = Integer.parseInt(sdf.format(calendar.getTime()));
        sdf = new SimpleDateFormat("m");
        int m2 = Integer.parseInt(sdf.format(calendar.getTime()));
        sdf = new SimpleDateFormat("s");
        int s = Integer.parseInt(sdf.format(calendar.getTime()));
        s = (((((y - 1970)*12+m1)*30+d)*24+h)*60+m2)*60+s;
        return s;
    }
}