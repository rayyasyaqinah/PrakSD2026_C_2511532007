package pekan3_2511532007;

import java.util.Scanner;
import java.util.Stack;

public class browser_2511532007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<website_2511532007> history = new Stack<>();

        int pilihan;

        do {
            System.out.println("\n=== Browser History NIM: 2511532007 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan URL: ");
                    String url = input.nextLine();

                    history.push(new website_2511532007(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
                    if (!history.isEmpty()) {
                        website_2511532007 removed = history.pop();
                        System.out.println("Kembali dari: " + removed.getJudul());
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;

                case 3:
                    if (!history.isEmpty()) {
                        System.out.println("Halaman aktif: " + history.peek());
                    } else {
                        System.out.println("Tidak ada halaman yang sedang dibuka.");
                    }
                    break;

                case 4:
                    System.out.println("Jumlah history: " + history.size());
                    System.out.println("Apakah kosong? " + history.isEmpty());
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }
}
