package alist;

import java.util.ArrayList;

public class Alist {
    public static void yazdır(ArrayList<String> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.println((i+1) + "." + "Grup: " + a.get(i));
        }
    }
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("Metallica");
        arraylist.add("Guns'n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Metallica");
        arraylist.add("Metallica");
        
        arraylist.remove("Metallica");//İlk indeksli metallicayı sildi
        arraylist.remove(2);
        
        
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(3));
        
        System.out.println(arraylist.indexOf("Metallica"));
        System.out.println(arraylist.lastIndexOf("Metallica"));
        
        System.out.println(arraylist.size());
        
        System.out.println(arraylist.indexOf("Dream Theater")); // Yoksa -1 döner
        
        arraylist.set(2, "Mega Death");
        
        yazdır(arraylist);
    }
    
}
