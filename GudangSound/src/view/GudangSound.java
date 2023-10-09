package view;

import java.util.ArrayList;
import gudangsound.Barang;
import gudangsound.Keadaan;
import gudangsound.TempatGudang;
import javax.swing.JOptionPane;
/**
 *
 * @author faiq ismail
 */
public class GudangSound extends javax.swing.JFrame {
  private ArrayList<GudangSound> gudangSoundList = new ArrayList<>();
  private Barang barang;
  private String lokasi;
  private String kondisi;
  private String status;
  private int stok;
  private static int nextId = 0;
  private int id;

     public GudangSound() {
        initComponents();
        gudangSoundList = new ArrayList<>();
         id = nextId;
         nextId++;
    }

public GudangSound(Barang barang, String lokasi, String kondisi, String status, int stok) {
    this.barang = barang;
    this.lokasi = lokasi;
    this.kondisi = kondisi;
    this.status = status;
    this.stok = stok;
    id = nextId;
         nextId++;
}

     private Barang getBarang() {
    return barang;
}

private String getLokasi() {
    return lokasi;
}

    private int setId(int i) {
        return id;
    }

    public int getId() {
    return id;
}

  private void setLokasi(String lokasi) {
    this.lokasi = lokasi;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlokasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkondisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        btnubahstatus = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gudang Sound System");

        jLabel2.setText("Barang ");

        txtbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarangActionPerformed(evt);
            }
        });

        jLabel3.setText("Stok ");

        txtstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstokActionPerformed(evt);
            }
        });

        jLabel4.setText("Lokasi");

        txtlokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlokasiActionPerformed(evt);
            }
        });

        jLabel5.setText("kondisi");

        txtkondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkondisiActionPerformed(evt);
            }
        });

        jLabel6.setText("Status");

        btndelete.setText("Hapus");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        btnubahstatus.setText("Ubah status");
        btnubahstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahstatusActionPerformed(evt);
            }
        });

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbarang, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(txtstok)
                            .addComponent(txtlokasi))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkondisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 105, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnubahstatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrefresh)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtlokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan)
                    .addComponent(btndelete)
                    .addComponent(btnedit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrefresh)
                    .addComponent(btnubahstatus))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarangActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txtbarangActionPerformed

    private void txtstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstokActionPerformed

    private void txtlokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlokasiActionPerformed

    private void txtkondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkondisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkondisiActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
String idToDeleteStr = JOptionPane.showInputDialog("Masukkan ID Barang yang akan dihapus:");
    
    // Check if the user clicked "Cancel"
    if (idToDeleteStr == null) {
        return; // Do nothing if Cancel is clicked
    }

    try {
        int idToDelete = Integer.parseInt(idToDeleteStr);

        // Find the index of the item with the matching ID
        int indexToDelete = -1;
        for (int i = 0; i < gudangSoundList.size(); i++) {
            if (gudangSoundList.get(i).getId() == idToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete != -1) {
            gudangSoundList.remove(indexToDelete);
            JOptionPane.showMessageDialog(null, "Barang dengan ID " + idToDelete + " berhasil dihapus.");
            showAllData();
        } else {
            JOptionPane.showMessageDialog(null, "Barang dengan ID " + idToDelete + " tidak ditemukan.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Masukkan ID yang valid (angka).");
    }    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    // Mengambil nilai dari elemen input
    String namaBarang = this.txtbarang.getText();
    String stokStr = this.txtstok.getText();
    String lokasi = this.txtlokasi.getText();
    String kondisi = this.txtkondisi.getText();
    String status = this.txtstatus.getText();

    // Memeriksa apakah semua input telah diisi
    if (namaBarang.isEmpty() || stokStr.isEmpty() || lokasi.isEmpty() || kondisi.isEmpty() || status.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Semua data harus diisi sebelum menyimpan.");
    } else {
        // Jika semua input telah diisi, lanjutkan dengan penyimpanan data
        int stok = Integer.parseInt(stokStr);

        TempatGudang tempatGudang = new TempatGudang(lokasi);
        Keadaan keadaan = new Keadaan(kondisi, status);
        Barang barang = new Barang(namaBarang, stok, tempatGudang, keadaan);
        GudangSound gudangSound = new GudangSound(barang, lokasi, kondisi, status, stok);
        
        gudangSound.setId(gudangSoundList.size() + 1);
        gudangSoundList.add(gudangSound);

        txtbarang.setText("");
        txtstok.setText("");
        txtlokasi.setText("");
        txtkondisi.setText("");
        txtstatus.setText("");

        showAllData();
    }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
 String idToEditStr = JOptionPane.showInputDialog("Masukkan ID Barang yang akan diedit:");

    // Check if the user clicked "Cancel"
    if (idToEditStr == null) {
        return; // Do nothing if Cancel is clicked
    }

    try {
        int idToEdit = Integer.parseInt(idToEditStr);

        // Find the index of the item with the matching ID
        int indexToEdit = -1;
        for (int i = 0; i < gudangSoundList.size(); i++) {
            if (gudangSoundList.get(i).getId() == idToEdit) {
                indexToEdit = i;
                break;
            }
        }

        if (indexToEdit != -1) {
            // Retrieve the GudangSound object to edit
            GudangSound gudangSoundToEdit = gudangSoundList.get(indexToEdit);

            // Prompt the user to enter new data
            String namaBarang = JOptionPane.showInputDialog("Masukkan Nama Barang:", gudangSoundToEdit.getBarang().getNamaBarang());
            int stok = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Stok:", gudangSoundToEdit.getBarang().getStok()));
            String lokasi = JOptionPane.showInputDialog("Masukkan Lokasi:", gudangSoundToEdit.getLokasi());
            String kondisi = JOptionPane.showInputDialog("Masukkan Kondisi:", gudangSoundToEdit.getBarang().getKeadaan().getKondisi());
            String status = JOptionPane.showInputDialog("Masukkan Status:", gudangSoundToEdit.getBarang().getKeadaan().getStatus());

            // Update the GudangSound object with new data
            gudangSoundToEdit.getBarang().setNamaBarang(namaBarang);
            gudangSoundToEdit.getBarang().setStok(stok);
            gudangSoundToEdit.setLokasi(lokasi);
            gudangSoundToEdit.getBarang().getKeadaan().setKondisi(kondisi);
            gudangSoundToEdit.getBarang().getKeadaan().setStatus(status);

            JOptionPane.showMessageDialog(null, "Barang dengan ID " + idToEdit + " berhasil diedit.");
            showAllData();
        } else {
            JOptionPane.showMessageDialog(null, "Barang dengan ID " + idToEdit + " tidak ditemukan.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Masukkan ID yang valid (angka).");
    }    }//GEN-LAST:event_btneditActionPerformed

    private void btnubahstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahstatusActionPerformed
 String idToChangeStr = JOptionPane.showInputDialog("Masukkan ID Barang yang akan diubah statusnya:");

    if (idToChangeStr == null) {
        return; // Do nothing if Cancel is clicked
    }

    try {
        int idToChange = Integer.parseInt(idToChangeStr);

        // Cari indeks item dengan ID yang sesuai
        int indexToChange = -1;
        for (int i = 0; i < gudangSoundList.size(); i++) {
            if (gudangSoundList.get(i).getId() == idToChange) {
                indexToChange = i;
                break;
            }
        }

        if (indexToChange != -1) {
            // ID yang dipilih ditemukan, sekarang kita simpan ID ini dalam selectedId
            int selectedId = idToChange;

            // Beralih ke JFrame ubahstatus
            ubahstatus ubahstatusFrame = new ubahstatus(gudangSoundList.get(indexToChange).getBarang());
            ubahstatusFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Barang dengan ID " + idToChange + " tidak ditemukan.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Masukkan ID yang valid (angka).");
    }
    
        }//GEN-LAST:event_btnubahstatusActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
showAllData();
    }//GEN-LAST:event_btnrefreshActionPerformed

private void showAllData() {
     output.setText("");

    // Loop through the list of GudangSound objects and add them to the JTextArea
    for (GudangSound item : gudangSoundList) {
        output.append("ID: " + item.getId() + "\n");
        Barang barang = item.getBarang();
        output.append("Nama Barang: " + barang.getNamaBarang() + "\n");
        output.append("Lokasi: " + item.getLokasi() + "\n");
        output.append("Kondisi: " + barang.getKeadaan().getKondisi() + "\n");
        output.append("Status: " + barang.getKeadaan().getStatus() + "\n");
        output.append("Stok: " + barang.getStok() + "\n");
        output.append("------------------------\n");
    }
}
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
            java.util.logging.Logger.getLogger(GudangSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GudangSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GudangSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GudangSound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GudangSound().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubahstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtkondisi;
    private javax.swing.JTextField txtlokasi;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables




    

    



   

   
}
