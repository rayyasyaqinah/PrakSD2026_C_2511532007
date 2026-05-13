package pekan6_2511532007;

import java.util.Scanner;

public class Musik_2511532007 {

    Lagu_2511532007 head_2007 = null;
    Lagu_2511532007 tail_2007 = null;

    // menambah lagu di akhir playlist
    public void tambahLagu_2007(String judul_2007, String penyanyi_2007) {

        Lagu_2511532007 laguBaru_2007 =
                new Lagu_2511532007(judul_2007, penyanyi_2007);

        // jika playlist kosong
        if (head_2007 == null) {
            head_2007 = laguBaru_2007;
            tail_2007 = laguBaru_2007;
        } else {
            tail_2007.next_2007 = laguBaru_2007;
            laguBaru_2007.prev_2007 = tail_2007;
            tail_2007 = laguBaru_2007;
        }

        System.out.println("Lagu berhasil ditambahkan!");
    }

    // menghapus lagu pertama
    public void hapusLaguAwal_2007() {

        // jika playlist kosong
        if (head_2007 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        // jika hanya ada satu lagu
        if (head_2007 == tail_2007) {
            head_2007 = null;
            tail_2007 = null;
        } else {
            head_2007 = head_2007.next_2007;
            head_2007.prev_2007 = null;
        }

        System.out.println("Lagu pertama berhasil dihapus!");
    }

    // menampilkan playlist dari awal ke akhir
    public void tampilMaju_2007() {

        if (head_2007 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532007 bantu_2007 = head_2007;

        System.out.println("=== Playlist Maju ===");

        while (bantu_2007 != null) {
            System.out.println(
                    "Judul : " + bantu_2007.judul_2007 +
                    " | Penyanyi : " + bantu_2007.penyanyi_2007);

            bantu_2007 = bantu_2007.next_2007;
        }
    }

    // menampilkan playlist dari akhir ke awal
    public void tampilMundur_2007() {

        if (tail_2007 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532007 bantu_2007 = tail_2007;

        System.out.println("=== Playlist Mundur ===");

        while (bantu_2007 != null) {
            System.out.println(
                    "Judul : " + bantu_2007.judul_2007 +
                    " | Penyanyi : " + bantu_2007.penyanyi_2007);

            bantu_2007 = bantu_2007.prev_2007;
        }
    }

    // mencari lagu berdasarkan judul
    public void cariLagu_2007(String judulCari_2007) {

        if (head_2007 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532007 bantu_2007 = head_2007;
        boolean ditemukan_2007 = false;

        while (bantu_2007 != null) {

            if (bantu_2007.judul_2007.equalsIgnoreCase(judulCari_2007)) {

                System.out.println("Lagu ditemukan!");
                System.out.println(
                        "Judul : " + bantu_2007.judul_2007);
                System.out.println(
                        "Penyanyi : " + bantu_2007.penyanyi_2007);

                ditemukan_2007 = true;
                break;
            }

            bantu_2007 = bantu_2007.next_2007;
        }

        if (!ditemukan_2007) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }

    // program utama
    public static void main(String[] args) {

        Scanner input_2007 = new Scanner(System.in);

        Musik_2511532007 playlist_2007 =
                new Musik_2511532007();

        int pilihan_2007;

        do {

            System.out.println("\n=== Playlist Musik NIM: 2511532007 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");

            System.out.print("Pilihan: ");
            pilihan_2007 = input_2007.nextInt();
            input_2007.nextLine();

            switch (pilihan_2007) {

                case 1:

                    System.out.print("Judul Lagu : ");
                    String judul_2007 =
                            input_2007.nextLine();

                    System.out.print("Penyanyi : ");
                    String penyanyi_2007 =
                            input_2007.nextLine();

                    playlist_2007.tambahLagu_2007(
                            judul_2007,
                            penyanyi_2007);

                    break;

                case 2:

                    playlist_2007.hapusLaguAwal_2007();

                    break;

                case 3:

                    playlist_2007.tampilMaju_2007();

                    break;

                case 4:

                    playlist_2007.tampilMundur_2007();

                    break;

                case 5:

                    System.out.print("Masukkan judul lagu: ");

                    String cari_2007 =
                            input_2007.nextLine();

                    playlist_2007.cariLagu_2007(
                            cari_2007);

                    break;

                case 6:

                    System.out.println("Program selesai.");
                    break;

                default:

                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2007 != 6);

        input_2007.close();
    }
}