package igorizm.com.tamagucci;

import java.io.IOException;
import java.util.Scanner;

class Question {

    Question() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("� ��� ��� ���� ��������?");
        System.out.println("y/n");
        String answer = scan.next();
        System.out.println();
        if (answer.equals("n") | answer.equals("y")) {
            Start start = new Start();
            String name;
            if (answer.equals("n")) {
                System.out.println("������� ��� �������");
                name = scan.next();
                System.out.println();

                start.dnHave(name);
                System.out.println("������� �� ����� " + name + " ������!");
                System.out.println();
                start.have(name);
            }
            else {
                System.out.println("������� ��� ������ �������");
                name = scan.next();
                System.out.println();

                start.have(name);
            }
        }
        else {
            System.out.println("������ ��  ������. ������� y(��) ��� n(���)");
        }
        scan.close();
    }
}