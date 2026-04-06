package pekan2_2511532007;

public class DaftarKataDriver_2511532007 {

	public static void main(String[] args) {
		DaftarKata_2511532007 a1 = new DaftarKata_2511532007();
		
		//menampilknan elemen (akhir)
		a1.tambah("Kami");
		a1.tambah("Informatika");
		
		// menyisipkan elemen indeks 1
		a1.tambahPada(1, "Mahasiswa");
		//cetak isi awal
		System.out.println("Awal: "  + a1);
		//mengubah elemen (index 1)
		a1.ubahElemen(1, "Department");
		System.out.println("Setelah Ubah: "  + a1);
		//menghapus elemen (hapus index 1)
		String terhapus = a1.hapusElemen(0);
		System.out.println("Terhapus: "  + a1);
		System.out.println("Setelah Hapus: "  + a1);
		//iterasi pada arraylist (cetak setiap elemen)
		System.out.println("Iterasi");
		a1.iterasiCetak();
		System.out.println();

	}

}
