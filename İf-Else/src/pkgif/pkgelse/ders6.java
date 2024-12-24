/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.pkgelse;
import java.util.Scanner;
/**
 *
 * @author mustafayigitguzel
 */
public class ders6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        int max = number;
        int count = 1;
        
        while(number != 0){
            number = input.nextInt();
            if(number > max){
                max = number;
                count = 1;
            }
            else if(number == max){
                count++;
            }
            System.out.println("The largest number is: "+max +"\n"+"The occurence count of largest number is: "+ count);
            System.out.print("Enter Number: ");
        }   
    }
}
