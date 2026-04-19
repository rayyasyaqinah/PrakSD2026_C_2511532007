package pekan2_2511532007;

import java.util.ArrayList;
import java.util.Scanner;

public class playlist_2511532007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<musik_2511532007> playlist = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== Playlist Musik NIM: 2511532007 ===");
            System.out.println("1. Tambah Lagu ");
            System.out.println("2. Lihat Playlist ");
            System.out.println("3. Hapus Lagu ");
            System.out.println("4. Cek Jumlah Lagu ");
            System.out.println("5. Keluar ");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penyanyi: ");
                    String penyanyi = input.nextLine();

                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    playlist.add(new musik_2511532007(judul, penyanyi, durasi));
                    System.out.println("Data berhasil ditambahkan! ");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong. ");
                    } else {
                        System.out.println("\nDaftar Lagu: ");
                        for (int i = 0; i < playlist.size(); i++) {
                            System.out.println((i + 1) + ". " + playlist.get(i));
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist kosong. ");
                    } else {
                        System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                        int index = input.nextInt();

                        if (index > 0 && index <= playlist.size()) {
                            playlist.remove(index - 1);
                            System.out.println("Lagu berhasil dihapus. ");
                        } else {
                            System.out.println("Nomor tidak valid. ");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Jumlah lagu dalam playlist: " + playlist.size());
                    break;

                case 5:
                    System.out.println("Program selesai. ");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia. ");
            }

        } while (pilihan != 5);

        input.close();
    }
}
