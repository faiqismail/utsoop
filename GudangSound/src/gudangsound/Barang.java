
package gudangsound;

import java.util.ArrayList;
import view.GudangSound;

/**
 *
 * @author faiq ismail
 */

public class Barang {
    private String namaBarang;
    private int stok;
    private TempatGudang tempatGudang;
    private Keadaan keadaan;
    private String lokasi;
    private String kondisi;
    private String nama;
   

    public Barang(String namaBarang, int stok, TempatGudang tempatGudang, Keadaan keadaan) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.tempatGudang = tempatGudang;
        this.keadaan = keadaan;
       
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

     public TempatGudang getTempatGudang() {
          return tempatGudang;
}

      public Keadaan getKeadaan() {
            return keadaan;
}

 


 

}
