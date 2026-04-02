package pekan1_2511532007;
public class driver_2511532007 {

    static mobil_2511532007[] data = new mobil_2511532007[10];
    static int jumlah = 0;
 

    // Method tambah mobil
    static void tambahMobil(mobil_2511532007 m) {
        if (jumlah < data.length) {
            data[jumlah] = m;
            jumlah++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    // Method hapus mobil
    static void hapusMobil(String nama) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getNama().equalsIgnoreCase(nama)) {
                for (int j = i; j < jumlah - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[jumlah - 1] = null;
                jumlah--;
                System.out.println("Mobil dihapus!");
                return;
            }
        }
        System.out.println("Mobil tidak ditemukan!");
    }

    // Tampilkan data
    static void tampilData() {
        for (int i = 0; i < jumlah; i++) {
            data[i].tampilMobil();
        }
    }

    public static void main(String[] args) {

    	mobil_2511532007 m1 = new mobil_2511532007("Avanza", 2020, 1300, 150000000, "Toyota");
    	mobil_2511532007 m2 = new mobil_2511532007("Civic", 2022, 1500, 500000000, "Honda");

        // Tambah mobil
        tambahMobil(m1);
        tambahMobil(m2);

        System.out.println("Data Mobil:");
        tampilData();

        // Hapus mobil
        hapusMobil("Avanza");

        System.out.println("\nSetelah Hapus:");
        tampilData();
    }
}