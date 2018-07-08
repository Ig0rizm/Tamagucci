package igorizm.com.tamagucci;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Start {
    private int g = 100;
    private String s;

    private final String WAY = "C:\\~\\��������\\";

    private Time time;

    void dnHave(String name) throws IOException {
        time = new Time();
        File file = new File(WAY + name + ".txt");
        try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
            out.println(name);
            out.println(g);
            out.println(g);
            out.println(time.getS());
        }
        time = null;
    }

    void have(String name) throws IOException {
        Game game = new Game();
        time = new Time();
        FileReader fr = new FileReader(WAY + name + ".txt");
        Scanner scan = new Scanner(fr);
        name = scan.nextLine();
        int food = scan.nextInt();
        int sleep = scan.nextInt();
        g = scan.nextInt();
        g = game.v(g);
        food = game.getFood(g, food);
        sleep = game.getSleep(g, sleep);
        fr.close();
        System.out.println("��� ������ �������: " + name);
        System.out.println("�������: " + food + "%");
        System.out.println("��������� ���: " + sleep + "%");
        FileWriter fw = new FileWriter(WAY + name + ".txt");
        fw.write(name);
        fw.write("\r\n");
        fw.write(String.valueOf(food));
        fw.write("\r\n");
        fw.write(String.valueOf(sleep));
        fw.write("\r\n");
        fw.write(String.valueOf(time.getS()));
        fw.close();
        time = null;
        if (food >= 1 | sleep >= 1) {
        	System.out.println("������� f, ���� ������ ������������ �������, s, ���� ������ ������������ ���, ��� quit, ����� �����");
            System.out.println();
            for (;;) {
                s = game.play(name, food, sleep);
                if (s.equals("quit")) break;
            }
        }
        else {
        	System.out.println(name + " ���� *(");
        	System.out.println();
        	System.out.println("������� quit, ����� �����");
        	for (;;) {
                s = game.play(name, food, sleep, (byte) 0);
                if (s.equals("quit")) break;
            }
        }
        scan.close();
    }
}