
package example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ozgun Yilmaz
 * 13.Mar.2024 14:19:07
 */
public class ExceptionTest {

    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Access element three :" + a[3]);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown  :" + e);
            e.printStackTrace();    //shows a more detailed error report
            Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, e); //best method
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
        }catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }finally{
            System.out.println("This line will execute always");
        }
        
        
        try {
            FileReader fr = new FileReader("E://file.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
            //Logger should be preferred over printing with println()
        }
    }
}