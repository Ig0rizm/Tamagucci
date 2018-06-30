package igorizm.com.tamagochi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	int y, M, d, h, m, s;
	
	Calendar calendar;
	SimpleDateFormat sdf;
	
	int getS() {
		calendar = Calendar.getInstance();
		
		sdf = new SimpleDateFormat("y");
		y = Integer.parseInt(sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("M");
		M = Integer.parseInt(sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("d");
		d = Integer.parseInt(sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("h");
		h = Integer.parseInt(sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("m");
		m = Integer.parseInt(sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("s");
		s = Integer.parseInt(sdf.format(calendar.getTime()));
		
		s = (((((y * 12) + M) * 30) * 24) * 60) + s;
		
		calendar = null;
		
		return s;
	}
}