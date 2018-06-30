package igorizm.com.tamagochi;

import java.io.IOException;
import java.util.Scanner;

public class Question {
	String answer, name, a;
	
	Scanner scan;
	Start start;
	
	Question() throws IOException {
		scan = new Scanner(System.in);
		
		System.out.println("У вас уже есть Тамагочи?");
		System.out.println("y/n");
		answer = scan.next();
		System.out.println();
		
		if(answer.equals("n") | answer.equals("y")) {
			start = new Start();
			
			if(answer.equals("n")) {
				System.out.println("Введите имя питомца");
				name = scan.next();
				System.out.println();
				
				start.dnHave(name);
				System.out.println("Питомец по имени " + name + " создан!");
				System.out.println();
				start.have(name);
				
				start = null;
			}
			else {	
				System.out.println("Введите имя вышего питомца");
				name = scan.next();
				System.out.println();
				
				start.have(name);
				
				start = null;
			}
		}
		else {
			System.out.println("Запрос не  найден. Введите y(да) или n(нет)");
		}
		
		scan.close();
		scan = null;
	}
}