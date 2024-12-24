
import java.util.ArrayList;


/**
 * @author Ozgun Yilmaz
 * 14.Mar.2024 12:36:50
 */
public class ShapeTest {

    public static void main(String [] args) {
        
        ArrayList ar = new ArrayList();
        ar.add(new Rectangle("rect1",3,4));
        ar.add(new Rectangle("rect2",4,6));
        ar.add(new Triangle("tri1",3,2));
        ar.add(new Triangle("tri1",6,9));
        ar.add(new Triangle("tri1",3,3));
        
        for (Object obj : ar) {
            Shape s = (Shape)obj;   //downcasting
            System.out.println(s.calculateArea());
        }
        System.out.println("-----------------------------------");
        //other method for traversing an arraylist
        for (int i = 0; i<ar.size(); i++){
            Shape s = (Shape)ar.get(i);
            System.out.println(s.calculateArea());
        }
        
    }
}
