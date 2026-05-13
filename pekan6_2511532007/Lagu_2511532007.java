package pekan6_2511532007;

// class node lagu
public class Lagu_2511532007 {
    String judul_2007;
    String penyanyi_2007;

    Lagu_2511532007 next_2007;
    Lagu_2511532007 prev_2007;

    // constructor
    public Lagu_2511532007(String judul_2007, String penyanyi_2007) {
        this.judul_2007 = judul_2007;
        this.penyanyi_2007 = penyanyi_2007;
        this.next_2007 = null;
        this.prev_2007 = null;
    }

    // getter judul
    public String getJudul_2007() {
        return judul_2007;
    }

    // setter judul
    public void setJudul_2007(String judul_2007) {
        this.judul_2007 = judul_2007;
    }

    // getter penyanyi
    public String getPenyanyi_2007() {
        return penyanyi_2007;
    }

    // setter penyanyi
    public void setPenyanyi_2007(String penyanyi_2007) {
        this.penyanyi_2007 = penyanyi_2007;
    }
}