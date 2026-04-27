package pekan4_2511532007;
import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2511532007 {
	public static void main(String[] args) {
		Queue<Integer> q_2007 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i_2007 = 0; i_2007 < 6; i_2007++)
			q_2007.add(i_2007);
		// menampilkan isi antrian
		System.out.println("elemen antrian " + q_2007 );
		// untuk menghapus kepala antrian
		int hapus = q_2007.remove();
		System.out.println("hapus elemen = " + hapus);
		System.out.println(q_2007);
		// untuk melihat antrian terdepan
		int depan = q_2007.peek();
		System.out.println("kepala antrian = " + depan);
		
		int banyak = q_2007.size();
		System.out.println("size antrian = " + banyak);
	}
}
