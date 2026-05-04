package pekan5_2511532007;

public class HapusSLL_2511532007 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511532007 deleteHead(NodeSLL_2511532007 head) {
		// jika SLL kosong
		if (head == null)
			return null;
		// pindahkan head ke node berikutnya
		head = head.next_2007;
		// return head baru
		return head; }
		//  fungsi menghapus node terakhir SLL
		public static NodeSLL_2511532007 removeLastNode(NodeSLL_2511532007 head) {
			// jika list kosong, return null
			if(head == null) {
				return null;
			}
			// jika list satu node, hapus node dan return null
			if(head.next_2007 == null) {
				return null;
			}
			// temukan node terakhir kedua
			NodeSLL_2511532007 secondLast = head;
			while (secondLast.next_2007.next_2007 != null) {
				secondLast = secondLast.next_2007;
			}
			//hapus node terakhir
			secondLast.next_2007 = null;
			return head;
		}
		// fungsi menghapus node di posisi tertentu
		public static NodeSLL_2511532007 deleteNode (NodeSLL_2511532007 head, int position) {
			NodeSLL_2511532007 temp = head;
			NodeSLL_2511532007 prev = null;
			// jika linked list null
			if (temp == null)
				return head;
			// kasus 1: head dihapus
			if (position == 1) {
				head = temp.next_2007;
				return head; }
			// kasus 2: menghapus node ditengah
				// telusuri ke node yang dihapus
			for (int i = 1; temp != null && i < position; i++) {
				prev = temp;
				temp = temp.next_2007; }
			// jika ditemukan, hapus node
			if (temp != null) {
				prev.next_2007 = temp.next_2007;
			} else {
				System.out.println("Data tidak ada"); }
				return head; }
			// fungsi mencetak SLL
			public static void printList(NodeSLL_2511532007 head) {
				NodeSLL_2511532007 curr = head;
				while (curr.next_2007 != null) {
					System.out.print(curr.data_2007+"-->");
					if (curr.next_2007 == null) {
						curr = curr.next_2007; }
						if (curr.next_2007==null) {
							System.out.print(curr.data_2007); }
							System.out.println(); }
						}
					
		// kelas main
		public static void main(String[] args) {
			// buat SLL 1 -> 2 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
			NodeSLL_2511532007 head = new NodeSLL_2511532007(1);
			head.next_2007 = new NodeSLL_2511532007(2);
			head.next_2007.next_2007 = new NodeSLL_2511532007(3);
			head.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(4);
			head.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(5);
			head.next_2007.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(6);
			// cetak list awal
			System.out.println("list awal: ");
			printList(head);
			//hapus head
			head= deleteHead(head);
			System.out.println("List setelah head dihapus: ");
			printList(head);
			// deleting node at position 2
			int position = 2;
			// hapus node terakhir
			head = deleteNode(head, position);
			// print list after deletion
			System.out.println("List setelah posisi 2 dihapus: ");
			printList(head);
		
		}
		}
				
			
					
					
				
			
			
			
		
	


