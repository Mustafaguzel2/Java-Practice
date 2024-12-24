
package pkgfinal.pkg2;

public class Demo {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // HashTable'a eleman ekleme
        hashTable.put("Tren");
        hashTable.put("Uçak");
        hashTable.put("Araba");
        hashTable.put("At");
        hashTable.put("Bisiklet");
        hashTable.put("Otobüs");
        hashTable.put("Tır");

        // Bütün elemanları listeleme
        System.out.println("Eleman silinmeden önce: ");
        hashTable.printHashTable();

        // Bir elemanı silme
        String itemToDelete = "Tır";
        boolean deleted = hashTable.delete(itemToDelete);
        if (deleted) {
            System.out.println("\nSilinen eleman: " + itemToDelete);
        } else {
            System.out.println("\nIEleman bulunamadı:  " + itemToDelete);
        }

        // HashTabledan bir eleman sildikten sonra listeyi bastırma
        System.out.println("\nSilinmeden sonra:");
        hashTable.printHashTable();

    }
    
}
