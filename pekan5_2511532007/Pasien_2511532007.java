package pekan5_2511532007;

import java.util.*;

public class Pasien_2511532007 {
    private String namaPasien_2007;
    private String keluhan_2007;
    private int nomorAntrian_2007;
    private Pasien_2511532007 next_2007;

    // Constructor
    public Pasien_2511532007(String namaPasien_2007, String keluhan_2007, int nomorAntrian_2007) {
        this.namaPasien_2007 = namaPasien_2007;
        this.keluhan_2007 = keluhan_2007;
        this.nomorAntrian_2007 = nomorAntrian_2007;
        this.next_2007 = null;
    }

    // Getter
    public String getNamaPasien_2007() {
        return namaPasien_2007;
    }

    public String getKeluhan_2007() {
        return keluhan_2007;
    }

    public int getNomorAntrian_2007() {
        return nomorAntrian_2007;
    }

    public Pasien_2511532007 getNext_2007() {
        return next_2007;
    }

    // Setter
    public void setNamaPasien_2007(String namaPasien_2007) {
        this.namaPasien_2007 = namaPasien_2007;
    }

    public void setKeluhan_2007(String keluhan_2007) {
        this.keluhan_2007 = keluhan_2007;
    }

    public void setNomorAntrian_2007(int nomorAntrian_2007) {
        this.nomorAntrian_2007 = nomorAntrian_2007;
    }

    public void setNext_2007(Pasien_2511532007 next_2007) {
        this.next_2007 = next_2007;
    }
}