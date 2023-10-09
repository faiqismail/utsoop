
package view;
import gudangsound.Barang;
import gudangsound.Keadaan;
import gudangsound.TempatGudang;
import javax.swing.JOptionPane;
/**
 *
 * @author faiq ismail
 */
public class ubahstatus extends javax.swing.JFrame {
 private Barang barang;


    public ubahstatus(Barang barang) {
    initComponents();
    this.barang = barang;
    txtstatus.setText(barang.getKeadaan().getStatus());
    txtbarang.setText("Nama barang: " + barang.getNamaBarang()); 
    txtstok.setText("Stok barang: " + barang.getStok());
   String lokasi = barang.getTempatGudang().getLokasi();
   txtlokasi.setText("Lokasi: " + lokasi);
   String kondisi = barang.getKeadaan().getKondisi();
   txtkondisi.setText("Kondisi: " + kondisi);    }

    private ubahstatus() {
initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        txtbarang = new javax.swing.JLabel();
        txtstok = new javax.swing.JLabel();
        txtlokasi = new javax.swing.JLabel();
        txtkondisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("status");

        jLabel2.setText("Merubah status");

        btncancel.setText("cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnsimpan.setText("simpan ");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        txtbarang.setText("Nama barang :");

        txtstok.setText("stok barang    :");

        txtlokasi.setText("lokasi              :");

        txtkondisi.setText("Kondisi           : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btncancel)
                                .addGap(55, 55, 55)
                                .addComponent(btnsimpan))
                            .addComponent(txtbarang)
                            .addComponent(txtstok)
                            .addComponent(txtlokasi)
                            .addComponent(txtkondisi)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(txtbarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtstok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlokasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtkondisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btncancel))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
  // Ambil status baru dari komponen teks
    String newStatus = txtstatus.getText();

    // Perbarui status objek Barang
    barang.getKeadaan().setStatus(newStatus);

    // Tampilkan pesan atau tindakan lain yang diperlukan
    JOptionPane.showMessageDialog(null, "Status barang berhasil diubah menjadi: " + newStatus);

    // Tutup jendela ubahstatus setelah mengubah status
    this.dispose();
    showAllData();

    }//GEN-LAST:event_btnsimpanActionPerformed
    private void showAllData() {
    String status = barang.getKeadaan().getStatus();
    
    txtstatus.setText(status);
}
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

    this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed


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
            java.util.logging.Logger.getLogger(ubahstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubahstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubahstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubahstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubahstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtbarang;
    private javax.swing.JLabel txtkondisi;
    private javax.swing.JLabel txtlokasi;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JLabel txtstok;
    // End of variables declaration//GEN-END:variables


}
