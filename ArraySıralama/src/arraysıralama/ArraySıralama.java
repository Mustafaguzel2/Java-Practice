package arraysıralama;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySıralama {
    public static void array_sort(int[] array) {
        //Arrays sınıfını kullanarak metod ile sıralama yapıcaz.
        
        Arrays.sort(array);
        arrayi_bastır(array);
    }
    
    public static int [] arrayi_doldur(int sayi) {
       Scanner scanner =new Scanner(System.in);
       int[] cikti =  new int[sayi];
       
       for (int i = 0; i < sayi; i++) {
           cikti[i] = scanner.nextInt();
       }
       return cikti;
    }
    
    public static void arrayi_bastır(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }
    public static void main(String[] args) {
         
        int[] a = arrayi_doldur(5);
        arrayi_bastır(a);
        array_sort(a);
       
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};
        
        if(Arrays.equals(a1, a2)) {
            System.out.println("Eşitler.");
        }
        else {
            System.out.println("Eşit değiller.");
        }
    }
}
