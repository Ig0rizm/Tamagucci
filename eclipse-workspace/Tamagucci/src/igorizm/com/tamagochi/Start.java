package igorizm.com.tamagochi;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Start {
	String name, s;
	int food, sleep, t, g = 100;
	
	final String WAY = "C:\\~\\Тамагочи\\";
	
	FileReader fr;
	FileWriter fw;
	Scanner scan;
	File file;
	Time time;
	Game game;
	
	void dnHave(String name) throws IOException {
		time = new Time();
		file = new File(WAY + name + ".txt");
		
	    if(!file.exists()) file.createNewFile();
	    PrintWriter out = new PrintWriter(file.getAbsoluteFile());
	    try {
	            out.println(name);
	            out.println(g);
	            out.println(g);
	            out.println(time.getS());
	    } finally {
	        out.close();
	    }
		
		file = null;
		time = null;
	}
	
	void have(String name) throws IOException {
		game = new Game();
		time = new Time();
		
		fr = new FileReader(WAY + name + ".txt");
		scan = new Scanner(fr);
			
		name = scan.nextLine();
		food = scan.nextInt();
		sleep = scan.nextInt();
		g = scan.nextInt();
			
		g = game.v(g);
		food = game.getFood(g, food);
		sleep = game.getSleep(g, sleep);
		
		scan.close();
		fr.close();
		fr = null;
		scan = null;
		
		System.out.println("Имя вашего питомца: " + name);
		System.out.println("Сытость: " + food + "%");
		System.out.println("Состояние сна: " + sleep + "%");
		
		fw = new FileWriter(WAY + name + ".txt");
		
		fw.write(name);
		fw.write("\r\n");
		fw.write(String.valueOf(food));
		fw.write("\r\n");
		fw.write(String.valueOf(sleep));
		fw.write("\r\n");
		fw.write(String.valueOf(time.getS()));
	
		fw.close();
		fw = null;
		time = null;
		
		System.out.println("Введите f, если хотите восстановить сытость, s, если хотите восстановить сон, или quit, чтобы выйти");
		System.out.println();
		
		for(;;) {
			s = game.inGame(name, food, sleep);
			if(s.equals("quit")) break;
		}
	}
}