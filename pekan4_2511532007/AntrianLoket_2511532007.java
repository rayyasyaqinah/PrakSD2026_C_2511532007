package pekan4_2511532007;
import java.util.Scanner;

public class AntrianLoket_2511532007 {
    public static void main(String[] args) {
        Scanner input_2007 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas_2007 = input_2007.nextInt();
        input_2007.nextLine();

        Queue_2511532007 antrian_2007 = new Queue_2511532007(kapasitas_2007);

        int pilihan_2007;

        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2007 = input_2007.nextInt();
            input_2007.nextLine();

            switch (pilihan_2007) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_2007 = input_2007.nextLine();
                    antrian_2007.enqueue_2007(nama_2007);
                    break;
                case 2:
                    antrian_2007.dequeue_2007();
                    break;
                case 3:
                    antrian_2007.display_2007();
                    break;
                case 4:
                    antrian_2007.reverse_2007();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilihan_2007 != 5);
    }
}