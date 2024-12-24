package çalışma3;

import java.util.Scanner;

public class Çalışma3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.print("Birinci kenar: ");
        a = scanner.nextDouble();
        System.out.print("İkinci kenar: ");
        b = scanner.nextDouble();
        double h = Math.sqrt((a * a) + (b * b));
        System.out.printf("%.2f Hipotenüs= ", h);
    }
    
}
