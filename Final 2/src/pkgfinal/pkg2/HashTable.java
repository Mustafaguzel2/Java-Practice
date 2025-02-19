
package pkgfinal.pkg2;

import java.util.Map;

public class HashTable {
    // Uses the generic LinkedList2 class from Display 15.7
	private LinkedList2[] hashArray;
	private static final int SIZE = 10;

	public HashTable()
	{
		hashArray = new LinkedList2[SIZE];
		for (int i=0; i < SIZE; i++)
			hashArray[i] = new LinkedList2();
	}

	private int computeHash(String s)
	{
		int hash = 0;
		for (int i = 0; i < s.length(); i++) {
		    hash += s.charAt(i);
		}
		return hash % SIZE;
	}

	/**
	 Returns true if the target is in the hash table,
	 false if it is not.
	*/
	public boolean containsString(String target)
	{
		int hash = computeHash(target);
		LinkedList2 list = hashArray[hash];
		if (list.contains(target))
			return true;
		return false;
	}

	/**
	 Stores string s into the hash table
	*/
	public void put(String s)
	{
		int hash = computeHash(s);	// Get hash value
		LinkedList2 list = hashArray[hash];
		if (!list.contains(s))
		{
			// Only add the target if it's not already
			// on the list.
			hashArray[hash].addToStart(s);
		}
	}
        //Linkedlist2 deki metodlar yardımıyla yazılmış delete metodu
        public boolean delete(String item) {
            int hash = computeHash(item);
            LinkedList2 list = hashArray[hash];
            if (list.contains(item)) {
                list.deleteHeadNode();
                return true;
            }
            return false;
            
        }
        //LinkedList2 deki metodlar yardımıyla yazılmış print metodu
        public void printHashTable() {
        for (int i = 0; i < SIZE; i++) {
            LinkedList2 list = hashArray[i];
            list.outputList();
        }
    }
        
}
