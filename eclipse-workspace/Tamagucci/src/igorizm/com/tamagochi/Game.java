package igorizm.com.tamagochi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
	long g;
	int v;
	String s;
	
	final String WAY = "C:\\~\\Тамагочи\\";
	
	Scanner scan;
	FileWriter fw;
	
	int v(int t) {
		Time time = new Time();
		
		g = time.getS() - t;
		v = (int) g;
		
		time = null;
		
		return v;
	}
	
	int getFood(int v, int food) {
		g = (5 * v) / 3600;
		food = (int) (food - g);
		
		return food;
	}
	
	int getSleep(int v, int sleep) {
		g = (5 * v) / 3600;
		sleep = (int) (sleep - g);
		
		return sleep;
	}
	
	String inGame(String name, int food, int sleep) throws IOException {
		Time time = new Time();
		scan = new Scanner(System.in);
		fw = new FileWriter(WAY + name + ".txt");
		
		for(;;) {
			s = scan.next();
			if(s.equals("quit")) {
				fw.write(name);
				fw.write("\r\n");
				fw.write(String.valueOf(food));
				fw.write("\r\n");
				fw.write(String.valueOf(sleep));
				fw.write("\r\n");
				fw.write(String.valueOf(time.getS()));
				break;
			}
			if(s.equals("f")) {
				food = 100;
				System.out.println("Еда успешно восстановлена!");
			}
			if(s.equals("s")) {
				sleep = 100;
				System.out.println("Сон успешно восстановлен!");
			}
		}
		
		fw.close();
		fw = null;
		time = null;
		
		return s;
	}
}
