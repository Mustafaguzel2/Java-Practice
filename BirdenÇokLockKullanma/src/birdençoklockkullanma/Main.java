package birdençoklockkullanma;
public class Main {
    public static void main(String[] args) {
        /*ListWorker worker = new ListWorker();
        long baslangic = System.currentTimeMillis();
        worker.degerAta();
        long bitis = System.currentTimeMillis();
        
        System.err.println("Geçen süre: " + (bitis - baslangic));*/
        ListWorker worker = new ListWorker();
        worker.calistir();
        
    }
}
