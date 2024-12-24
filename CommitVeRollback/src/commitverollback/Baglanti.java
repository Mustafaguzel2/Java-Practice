package commitverollback;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//commit bütün sorguları çalıştırır
//rollback bütün sorguları iptal eder
//transaction eğer herhangi bir adımda sorun olursa işlem iptali ile her şeyi eski ayara döndürmek demektir
        
public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    
    private Statement statement = null;
    
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    
    private PreparedStatement preparedStatement = null;
    
    public void commitverollback(){
        Scanner scanner = new Scanner(System.in);
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'mustafaguzel879@gmail.com' where id =1";
            
            System.err.println("Güncellemeden önce ");
            calisanlariGetir();
            
            Statement statement2 = con.createStatement();
            
            statement2.executeUpdate(sorgu1);
            statement2.executeUpdate(sorgu2);
            System.err.println("İşlemleriniz kaydedilsin mi?(yes/no)");
            String cevap = scanner.nextLine();
            
            if(cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.err.println("Veritabanı güncellendi");
            }
            else{
                con.rollback();
                System.err.println("Veritabanını güncellemediniz");
                calisanlariGetir();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void preparedCalisanlariGetir(int id){
        String sorgu = "Select * From calisanlar where id > ? and ad like ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "M%");
            
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.err.println("ad: " + ad + " soyad: " + soyad + " email: " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanSil(){
        try {
            
            statement = con.createStatement();
            String sorgu = "Delete from calisanlar where id > 3";
            int deger = statement.executeUpdate(sorgu);
            System.err.println( deger +" kadar eri silindi!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    public void calisanGüncelle(){
        try {
            
            statement = con.createStatement();
            String sorgu = "Update calisanlar Set email = 'mustafaguzel@tss-x.com' where id = 1";
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanEkle() {
    try {
        Scanner scanner = new Scanner(System.in);
        Boolean cevap = true;

        while (cevap == true) {
            System.err.println("Daha fazla kişi eklemek istiyor musunuz?(E veya H)");
            String yanit = scanner.nextLine();
            if (yanit.equalsIgnoreCase("H")) {
                cevap = false;
            } else {
                System.err.println("Bilgileri sırayla giriniz: ");
                String ad = scanner.nextLine();
                String soyad = scanner.nextLine();
                String email = scanner.nextLine();
                
                String sorgu = "INSERT INTO calisanlar(ad, soyad, email) VALUES (?, ?, ?)";
                
                // PreparedStatement kullanarak sorguyu oluştur
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, ad);
                preparedStatement.setString(2, soyad);
                preparedStatement.setString(3, email);
                
                // Sorguyu çalıştır
                preparedStatement.executeUpdate();
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }
}    
    public void calisanlariGetir(){
        String sorgu = "Select * From calisanlar ";/*where id > 2 id'si 2den büyük olanlar gelir*/
        try {
            
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.err.println("Id: " + id + " Ad: " + ad + " Soyad: " + soyad + " Email: " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Baglanti(){
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi +"?useUnicode=true&characterEncoding=utf8";
        
        try {
            // MySQL JDBC Driver'ını yükleyin
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Bağlantıyı kurun
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı!");

        } catch (ClassNotFoundException ex) {
            System.err.println("Driver bulunamadı!");
        } catch (SQLException ex) {
            System.err.println("Bağlantı başarısız: " + ex.getMessage());
        }
    }
    
    
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        /*baglanti.calisanlariGetir();
        baglanti.preparedCalisanlariGetir(0);
        baglanti.calisanEkle();
        baglanti.calisanlariGetir();*/
        baglanti.commitverollback();
    }
}     

