package igorizm.com.tamagucci;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Game {
    private long g;

    int v(int t) {
        Time time = new Time();
        g = time.getS() - t;
        return (int) g;
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

    String play(String name, int food, int sleep) throws IOException {
        Time time = new Time();
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String WAY = "C:\\~\\Тамагочи\\";
        FileWriter fw = new FileWriter(WAY + name + ".txt");
        String s;
        for (;;) {
            s = scan.next();
            if (s.equals("quit")) {
                fw.write(name);
                fw.write("\r\n");
                fw.write(String.valueOf(food));
                fw.write("\r\n");
                fw.write(String.valueOf(sleep));
                fw.write("\r\n");
                fw.write(String.valueOf(time.getS()));
                break;
            }
            if (s.equals("f")) {
                food = 100;
                System.out.println("Еда успешно восстановлена!");
            }
            if (s.equals("s")) {
                sleep = 100;
                System.out.println("Сон успешно восстановлен!");
            }
        }
        fw.close();
        return s;
    }
    
    String play(String name, int food, int sleep, byte k) throws IOException {
    	Time time = new Time();
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String WAY = "C:\\~\\Тамагочи\\";
        FileWriter fw = new FileWriter(WAY + name + ".txt");
        String s;
    	for (;;) {
            s = scan.next();
            if (s.equals("quit")) {
                fw.write(name);
                fw.write("\r\n");
                fw.write(String.valueOf(food));
                fw.write("\r\n");
                fw.write(String.valueOf(sleep));
                fw.write("\r\n");
                fw.write(String.valueOf(time.getS()));
                break;
            }
        }
    	fw.close();
    	return s;
    }
}