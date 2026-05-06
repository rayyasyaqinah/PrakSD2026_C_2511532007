package pekan5_2511532007;

import java.util.Scanner;

public class RumahSakit_2511532007 {
    private Pasien_2511532007 head_2007;
    private int counter_2007 = 0;

   
    public void daftarkanPasien_2007(String nama_2007, String keluhan_2007) {
        counter_2007++;
        Pasien_2511532007 pasienBaru_2007 =
                new Pasien_2511532007(nama_2007, keluhan_2007, counter_2007);

        if (head_2007 == null) {
            head_2007 = pasienBaru_2007;
        } else {
            Pasien_2511532007 current_2007 = head_2007;
            while (current_2007.getNext_2007() != null) {
                current_2007 = current_2007.getNext_2007();
            }
            current_2007.setNext_2007(pasienBaru_2007);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_2007);
    }

   
    public void panggilPasien_2007() {
        if (head_2007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Pasien dipanggil:");
        System.out.println("Nama: " + head_2007.getNamaPasien_2007());
        System.out.println("Keluhan: " + head_2007.getKeluhan_2007());
        System.out.println("Nomor Antrian: " + head_2007.getNomorAntrian_2007());

        head_2007 = head_2007.getNext_2007();
    }

   
    public void tampilkanAntrian_2007() {
        if (head_2007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511532007 current_2007 = head_2007;

        System.out.println("\n=== Daftar Antrian Pasien ===");
        while (current_2007 != null) {
            System.out.println("No Antrian : " + current_2007.getNomorAntrian_2007());
            System.out.println("Nama       : " + current_2007.getNamaPasien_2007());
            System.out.println("Keluhan    : " + current_2007.getKeluhan_2007());
            System.out.println("------------------------");

            current_2007 = current_2007.getNext_2007();
        }
    }

   
    public void cariPasien_2007(String namaCari_2007) {
        if (head_2007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien_2511532007 current_2007 = head_2007;
        boolean ditemukan_2007 = false;

        while (current_2007 != null) {
            if (current_2007.getNamaPasien_2007().equalsIgnoreCase(namaCari_2007)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("Nama: " + current_2007.getNamaPasien_2007());
                System.out.println("Keluhan: " + current_2007.getKeluhan_2007());
                System.out.println("Nomor Antrian: " + current_2007.getNomorAntrian_2007());
                ditemukan_2007 = true;
                break;
            }

            current_2007 = current_2007.getNext_2007();
        }

        if (!ditemukan_2007) {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

  
    public void cekStatusAntrian_2007() {
        if (head_2007 == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlah_2007 = 0;
        Pasien_2511532007 current_2007 = head_2007;

        while (current_2007 != null) {
            jumlah_2007++;
            current_2007 = current_2007.getNext_2007();
        }

        System.out.println("Total pasien dalam antrian: " + jumlah_2007);
        System.out.println("Pasien terdepan: " + head_2007.getNamaPasien_2007());
    }


    public static void main(String[] args) {
        Scanner input_2007 = new Scanner(System.in);
        RumahSakit_2511532007 rs_2007 = new RumahSakit_2511532007();

        int pilihan_2007;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532007 ===");
            System.out.println("1. Daftarkan Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Cari Pasien");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2007 = input_2007.nextInt();
            input_2007.nextLine();

            switch (pilihan_2007) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_2007 = input_2007.nextLine();

                    System.out.print("Masukkan Keluhan: ");
                    String keluhan_2007 = input_2007.nextLine();

                    rs_2007.daftarkanPasien_2007(nama_2007, keluhan_2007);
                    break;

                case 2:
                    rs_2007.panggilPasien_2007();
                    break;

                case 3:
                    rs_2007.tampilkanAntrian_2007();
                    break;

                case 4:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String cari_2007 = input_2007.nextLine();
                    rs_2007.cariPasien_2007(cari_2007);
                    break;

                case 5:
                    rs_2007.cekStatusAntrian_2007();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan_2007 != 6);

        input_2007.close();
    }
}
