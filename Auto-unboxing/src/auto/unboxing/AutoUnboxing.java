package auto.unboxing;

import java.util.ArrayList;

public class AutoUnboxing {
    /*
    boolean, char, byte, short, int, long, float, double arraylist içine yazılamaz.
    Wrapper classlar kullanılır. baş harfi büyük olacak
    */
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        /*
        for (int i = 0; i < 10; i++ ) {
            arraylist2.add(Integer.valueOf(i*4));//Autoboxing
        }
        for(int i = 0; i < arraylist2.size(); i++) {
            System.out.println(arraylist2.get(i).intValue());//unboxing
        }*/
        for (int i = 0; i < 10; i++ ) {//Aslında böyle yapmak yeterli
            arraylist2.add(i*4);
        }
        for(int i = 0; i < arraylist2.size(); i++) {//java kendi boxing yapıyo
            System.out.println(arraylist2.get(i));
        }
    }   
        
}
