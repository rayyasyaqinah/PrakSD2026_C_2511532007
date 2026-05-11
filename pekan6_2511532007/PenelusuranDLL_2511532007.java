package pekan6_2511532007;

public class PenelusuranDLL_2511532007 {
    //fungsi penelusuran maju
	static void forwardTraversal (NodeDLL_2511532007 head) {
		//memulai penelusuran dari head
		NodeDLL_2511532007 curr = head;
		//lanjutkan sampai akhir
		while (curr != null) {
			//print data'
			System.out.print(curr.data_2007 + " <-> ");
			//pindah ke node berikutnya
			curr = curr.next_2007;
		}
		//print spasi
		System.out.println();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal (NodeDLL_2511532007 tail) {
		//mulai dari akhir
		NodeDLL_2511532007 curr = tail;
		//lanjutkan sampai head
		while (curr != null) {
			//cetakt data'
			System.out.print(curr.data_2007 + " <-> ");
			//pindah ke node sebelumnya
			curr = curr.prev_2007;
		}
		//print spasi
		System.out.println();
	}
	 public static void main(String[] args) {
		 //cetak DLL
		 NodeDLL_2511532007 head = new NodeDLL_2511532007 (1);
		 NodeDLL_2511532007 second = new NodeDLL_2511532007 (2);
		 NodeDLL_2511532007 third = new NodeDLL_2511532007 (3);
		 
		 head.next_2007 = second;
		 second.prev_2007 = head;
		 second.next_2007 = third;
		 third.prev_2007 = second;
		 
		 System.out.println("Penelusuran maju: ");
		 forwardTraversal(head);
		 
		 System.out.println("Penelusuran mundur: ");
		 backwardTraversal(third);
	 }
}
