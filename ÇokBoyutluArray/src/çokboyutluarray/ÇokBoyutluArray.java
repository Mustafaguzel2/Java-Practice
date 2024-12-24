package çokboyutluarray;

import java.util.Scanner;

public class ÇokBoyutluArray {
    public static void main(String[] args) {
        
        int[][] array = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++) {
            
            for(int j = 0; j < 2; j++) {
                
                array[i][j] = scanner.nextInt();
                
            }
        }
        System.out.println("****************");
        for(int i = 0; i < 2; i++) {
            
            for(int j = 0; j < 2; j++) {
                
                System.out.print(array[i][j] + " ");
                
            }
            
            System.out.println("");
        }
        
        /*
        int[][] array2 = {{10,20},{30,40}};
        
        System.out.println(array2[0][1]);
        //iki şekildede içi doldurulabilir.
        
        array2[0][0] = 10;
        array2[0][1] = 20;
        array2[1][0] = 30;
        array2[1][1] = 40;
        */
        
    }
    
}
