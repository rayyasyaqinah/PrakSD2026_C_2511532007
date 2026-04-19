package pekan3_2511532007;

public class website_2511532007 {
    private String judul_2007;
    private String url_2007;

    // Constructor
    public website_2511532007(String judul, String url) {
        this.judul_2007 = judul;
        this.url_2007 = url;
    }

    // Getter
    public String getJudul() {
        return judul_2007;
    }

    public String getUrl() {
        return url_2007;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul_2007 = judul;
    }

    public void setUrl(String url) {
        this.url_2007 = url;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_2007 + ", URL: " + url_2007;
    }
}