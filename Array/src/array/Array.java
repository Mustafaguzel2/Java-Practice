
package array;

import java.util.Scanner;

public class Array {
    public static void arrayi_bastır(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }
    public static void main(String[] args) {
        // int ve stringleri depolayama bilmemizi sağlar
        
        /*int[] a = new int[10]; //10 tane int depolama yeri açıldı.
                               //a temsil eder.Sayı arttırımı yapılamaz.
                               //0 1 2 diye indeksleri var
        a[5] = 32;
        a[9] = 50;
        
        int[] a = {30,40,50,60,70};
        
        System.out.println(a[0]);
        System.out.println(a[4]);

        int[] b = new int[5];
        for(int i = 0; i < 5; i++) {
            b[i] = i * 4 + 2;
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
        
        int[] c = new int[5];
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            c[i] = scanner.nextInt();     
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(c[i]);
        }
        */
        int[] d = {10,20,30,40,50};
        System.out.println("Arreyimizin uzunluğu = " + d.length);
        
        arrayi_bastır(d);
    }
    
}
