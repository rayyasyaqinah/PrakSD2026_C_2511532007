package pekan2_2511532007;
import java.util.ArrayList;
public class DaftarKata_2511532007 {
  private final ArrayList<String> data;
  // konstruktor: inisialisasi list kosong
  public DaftarKata_2511532007() {
	  this.data = new ArrayList<>();
  }
  /** menambahkan elemen diakhir list. */
  public void tambah(String elemen) {
	  data.add(elemen);
  }
  /** menambahkan elemen pada indeks tertentu (menyisipkan). */
  public void tambahPada(int index, String elemen) {
	  data.add(index, elemen);
  }
  /** 
   * mengubah elemen pada posisi 'index' menjadi 'nilaiBaru".
   */
  public void ubahElemen(int index, String nilaiBaru) {
	  data.set(index, nilaiBaru);
  }
  /** 
   * menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus. 
   */
  public String hapusElemen(int index) {
	  return data.remove(index);
  }
  /** 
   * Melakukan uterasi dan mencetak setiap elemen dalam format:[index] nilai
   * (Metode ini tidak mengembalikan nilai: hanya demonstrasi iterasi.
   */
  public void iterasiCetak() {
	  for (int i = 0; i < data.size(); i++) {
		  System.out.print(data.get(i)+" ");
	   }
  }
  
  /** Mengambil elemen berdasarkan indeks. */
  public String get (int index) {
	   return data.get(index);
  }
  
  
  //representasi string agar mudah dicetak
  @Override
  public String toString() {
	   return data.toString();
  }
  }
   
   
   
   


