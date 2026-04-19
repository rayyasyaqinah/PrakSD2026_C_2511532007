package pekan2_2511532007;

public class musik_2511532007 {
    private String judul_2007;
    private String penyanyi_2007;
    private int durasi_2007;

    // Constructor
    public musik_2511532007(String judul, String penyanyi, int durasi) {
        this.judul_2007 = judul;
        this.penyanyi_2007 = penyanyi;
        this.durasi_2007 = durasi;
    }

    // Getter
    public String getJudul() {
        return judul_2007;
    }

    public String getPenyanyi() {
        return penyanyi_2007;
    }

    public int getDurasi() {
        return durasi_2007;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul_2007 = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi_2007 = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi_2007 = durasi;
    }

    @Override
    public String toString() {
        return " Judul: " + judul_2007 + 
               " Penyanyi: " + penyanyi_2007 + 
               " Durasi: " + durasi_2007 + " detik";
    }
}

