package gudangsound;


/**
 *
 * @author faiq ismail
 */
public class Keadaan {
    private String kondisi;
    private String status;

    public Keadaan(String kondisi, String status) {
        this.kondisi = kondisi;
        this.status = status;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

