package pekan6_2511532007;

public class HapusDLL_2511532007 {
  //fungsi menghapus node awal
	public static NodeDLL_2511532007 delHead (NodeDLL_2511532007 head_2007) {
		if (head_2007 == null) {
			return null;  }
			NodeDLL_2511532007 temp = head_2007;
			head_2007 = head_2007.next_2007;
			if (head_2007 != null) {
				head_2007.prev_2007 = null;   }
				return head_2007;
			}
	//fungsi menghapus di akhir
	public static NodeDLL_2511532007 delLast (NodeDLL_2511532007 head_2007) {
		if (head_2007 == null) {
			return null;   }
		if (head_2007.next_2007 == null) {
			return null;   }
		NodeDLL_2511532007 curr_2007 = head_2007;
		while (curr_2007.next_2007 != null) {
			curr_2007 = curr_2007.next_2007;
			}
		//update pointer previous node
		if (curr_2007.prev_2007 != null) {
			curr_2007.prev_2007.next_2007 = null;  }
		return head_2007;
}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532007 delPos (NodeDLL_2511532007 head_2007, int pos_2007) {
		//jika DLL kosong
		if (head_2007 == null) {
			return head_2007;   }
		NodeDLL_2511532007 curr_2007 = head_2007;
		//telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_2007 != null && i < pos_2007; ++i) {
			curr_2007 = curr_2007.next_2007; }
			//jika posisi tidak ditemukan
			if (curr_2007 == null) {
				return head_2007;  }
			//update pointer 
			if (curr_2007.prev_2007 != null) {
				curr_2007.prev_2007.next_2007 = curr_2007.next_2007;  }
			if (curr_2007.next_2007 != null) {
				curr_2007.next_2007.prev_2007 = curr_2007.prev_2007;   }
			//jika yang dihapus head
			if (head_2007 == curr_2007) {
				head_2007 = curr_2007.next_2007;   }
			return head_2007;
			}
		//fungsi mencetak DLL
		public static void printList (NodeDLL_2511532007 head_2007) {
			NodeDLL_2511532007 curr_2007 = head_2007;
			while (curr_2007 != null) {
				System.out.print(curr_2007.data_2007 + " ");
				curr_2007 = curr_2007.next_2007;
			}
			System.out.println();
		}
		public static void main(String[] args) {
		    // buat sebuah DLL
		    NodeDLL_2511532007 head_2007 = new NodeDLL_2511532007(1);
		    head_2007.next_2007 = new NodeDLL_2511532007(2);
		    head_2007.next_2007.prev_2007 = head_2007;
		    head_2007.next_2007.next_2007 = new NodeDLL_2511532007(3);
		    head_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007;
		    head_2007.next_2007.next_2007.next_2007 = new NodeDLL_2511532007(4);
		    head_2007.next_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007.next_2007;
		    head_2007.next_2007.next_2007.next_2007.next_2007 = new NodeDLL_2511532007(5);
		    head_2007.next_2007.next_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007.next_2007.next_2007;

		    System.out.print("DLL Awal: ");
		    printList(head_2007);

		    System.out.print("Setelah head dihapus: ");
		    head_2007 = delHead(head_2007);
		    printList(head_2007);

		    System.out.print("Setelah node terakhir dihapus: ");
		    head_2007 = delLast(head_2007);
		    printList(head_2007);

		    System.out.print("menghapus node ke 2: ");
		    head_2007 = delPos(head_2007, 2);

		    printList(head_2007);
		}
	
}