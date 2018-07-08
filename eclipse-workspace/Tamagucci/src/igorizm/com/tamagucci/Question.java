package igorizm.com.tamagucci;

import java.io.IOException;
import java.util.Scanner;

class Question {

    Question() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("У вас уже есть Тамагочи?");
        System.out.println("y/n");
        String answer = scan.next();
        System.out.println();
        if (answer.equals("n") | answer.equals("y")) {
            Start start = new Start();
            String name;
            if (answer.equals("n")) {
                System.out.println("Введите имя питомца");
                name = scan.next();
                System.out.println();

                start.dnHave(name);
                System.out.println("Питомец по имени " + name + " создан!");
                System.out.println();
                start.have(name);
            }
            else {
                System.out.println("Введите имя вышего питомца");
                name = scan.next();
                System.out.println();

                start.have(name);
            }
        }
        else {
            System.out.println("Запрос не  найден. Введите y(да) или n(нет)");
        }
        scan.close();
    }
}