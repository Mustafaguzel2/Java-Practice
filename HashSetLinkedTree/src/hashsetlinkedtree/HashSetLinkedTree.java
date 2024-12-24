package hashsetlinkedtree;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLinkedTree {

    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("12 Str");
        h.add(12);
        h.add(12);// bir tane olur
        h.add(12.0);
        h.add(null);
        h.add(true);
        
        h.remove(0); // elemanı yazmak lazım sıralama yok index olmaz
        h.remove(null);
        System.out.println(h.contains(12));
        
        Iterator itr = h.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        h.forEach(item -> System.out.print(item + " ,"));
    }
    
    
}
