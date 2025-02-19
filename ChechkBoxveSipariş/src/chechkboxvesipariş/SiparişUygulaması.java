/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chechkboxvesipariş;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author mustafayigitguzel
 */
public class SiparişUygulaması extends javax.swing.JFrame {
    Map<String,Integer> siparişler = new LinkedHashMap<String,Integer>();
    /**
     * Creates new form SiparişUygulaması
     */
    public SiparişUygulaması() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        İskender = new javax.swing.JCheckBox();
        Beyti = new javax.swing.JCheckBox();
        Salata = new javax.swing.JCheckBox();
        Ayran = new javax.swing.JCheckBox();
        Sipariş_Göster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Uygulaması");

        jLabel1.setText("MENU");

        İskender.setText("İskender - 200TL");

        Beyti.setText("Beyti - 180 TL");

        Salata.setText("Salata - 75 TL");

        Ayran.setText("Ayran - 15 TL");

        Sipariş_Göster.setText("Siparişleri Göster");
        Sipariş_Göster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sipariş_GösterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ayran)
                    .addComponent(Salata)
                    .addComponent(Beyti)
                    .addComponent(Sipariş_Göster)
                    .addComponent(İskender))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(İskender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Beyti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ayran)
                .addGap(18, 18, 18)
                .addComponent(Sipariş_Göster)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void siparişleriGöster(){
        
        int tutar = 0;
        String message = " ";
        if(siparişler.isEmpty()) {
            message = "Hiçbir ürün sipariş etmediniz";
        }
        else {
            message += "Siparişler\n";

            for(Map.Entry<String,Integer> entry: siparişler.entrySet()) {
                message += entry.getKey() + "\n";
                tutar += entry.getValue();
                
            }
            message += "Toplam tutar: " + tutar + " TL";
        }
        JOptionPane.showMessageDialog(this, message);
    }
    private void Sipariş_GösterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sipariş_GösterActionPerformed
        if(İskender.isSelected()){
            siparişler.put("İskender", 200);
        }
        else {
            siparişler.remove("İskender");
        }
        if(Beyti.isSelected()){
            siparişler.put("Beyti", 180);
        }
        else {
            siparişler.remove("Beyti");
        }
        if(Salata.isSelected()){
            siparişler.put("Salata", 75);
        }
        else {
            siparişler.remove("Salata");
        }
        if(Ayran.isSelected()){
            siparişler.put("Ayran", 15);
        }
        else {
            siparişler.remove("Ayran");
        }
        
        siparişleriGöster();
    }//GEN-LAST:event_Sipariş_GösterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SiparişUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparişUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparişUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparişUygulaması.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparişUygulaması().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ayran;
    private javax.swing.JCheckBox Beyti;
    private javax.swing.JCheckBox Salata;
    private javax.swing.JButton Sipariş_Göster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox İskender;
    // End of variables declaration//GEN-END:variables
}
