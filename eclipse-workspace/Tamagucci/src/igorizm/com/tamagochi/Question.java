package igorizm.com.tamagochi;

import java.io.IOException;
import java.util.Scanner;

public class Question {
	String answer, name, a;
	
	Scanner scan;
	Start start;
	
	Question() throws IOException {
		scan = new Scanner(System.in);
		
		System.out.println("� ��� ��� ���� ��������?");
		System.out.println("y/n");
		answer = scan.next();
		System.out.println();
		
		if(answer.equals("n") | answer.equals("y")) {
			start = new Start();
			
			if(answer.equals("n")) {
				System.out.println("������� ��� �������");
				name = scan.next();
				System.out.println();
				
				start.dnHave(name);
				System.out.println("������� �� ����� " + name + " ������!");
				System.out.println();
				start.have(name);
				
				start = null;
			}
			else {	
				System.out.println("������� ��� ������ �������");
				name = scan.next();
				System.out.println();
				
				start.have(name);
				
				start = null;
			}
		}
		else {
			System.out.println("������ ��  ������. ������� y(��) ��� n(���)");
		}
		
		scan.close();
		scan = null;
	}
}