package pekan1_2511532007;

public class mobil_2511532007 {
	    // Atribut
	    private String nama;
	    private int tahun;
	    private int cc;
	    private int harga;
	    private String merk;

	    // Constructor
	    public mobil_2511532007(String nama, int tahun, int cc, int harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    // Selektor (getter)
	    public String getNama() {
	        return nama;
	    }

	    public int getTahun() {
	        return tahun;
	    }

	    public int getCc() {
	        return cc;
	    }

	    public double getHarga() {
	        return harga;
	    }

	    public String getMerk() {
	        return merk;
	    }

	    // Mutator (setter)
	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public void setTahun(int tahun) {
	        this.tahun = tahun;
	    }

	    public void setCc(int cc) {
	        this.cc = cc;
	    }

	    public void setHarga(int harga) {
	        this.harga = harga;
	    }

	    public void setMerk(String merk) {
	        this.merk = merk;
	    }

	    // Method tampil data
	    public void tampilMobil() {
	        System.out.println("Nama  : " + nama);
	        System.out.println("Tahun : " + tahun);
	        System.out.println("CC    : " + cc);
	        System.out.println("Harga : " + harga);
	        System.out.println("Merk  : " + merk);
	        System.out.println("----------------------");
	    }
	}

