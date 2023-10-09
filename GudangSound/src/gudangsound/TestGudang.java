package gudangsound;


/**
 *
 * @author faiq ismail
 */



public class TestGudang{
    public static void main(String[] args) {
        TempatGudang tempatGudang1 = new TempatGudang("Rak 1");
        Keadaan keadaan1 = new Keadaan("Baik", "Tersedia");
        Barang barang1 = new Barang("Mikrofon", 10, tempatGudang1, keadaan1);
        TempatGudang tempatGudang2 = new TempatGudang("Rak 12");
        Keadaan keadaan2 = new Keadaan("Lecet", "Sold");
        Barang barang2 = new Barang("Sound", 10, tempatGudang2, keadaan2);

        // Menampilkan informasi barang
        System.out.println("Nama Barang: " + barang1.getNamaBarang());
        System.out.println("Stok Barang: " + barang1.getStok());
        System.out.println("Tempat Gudang: " + barang1.getTempatGudang().getLokasi());
        System.out.println("Kondisi: " + barang1.getKeadaan().getKondisi());
        System.out.println("Status: " + barang1.getKeadaan().getStatus());
        System.out.println("\nNama Barang: " + barang2.getNamaBarang());
        System.out.println("Stok Barang: " + barang2.getStok());
        System.out.println("Tempat Gudang: " + barang2.getTempatGudang().getLokasi());
        System.out.println("Kondisi: " + barang2.getKeadaan().getKondisi());
        System.out.println("Status: " + barang2.getKeadaan().getStatus());
    }
}

