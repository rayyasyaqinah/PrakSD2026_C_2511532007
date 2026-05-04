package pekan5_2511532007;

public class TambahSLL_2511532007 {
	public static NodeSLL_2511532007 insertAtFront(NodeSLL_2511532007 head, int value) {
		NodeSLL_2511532007 new_node = new NodeSLL_2511532007(value);
		new_node.next_2007 = head;
		return new_node;
	}
	// fungsi menambahkan node diakhir SLL
	public static NodeSLL_2511532007 insertAtEnd(NodeSLL_2511532007 head, int value) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511532007 newNode_2007 = new NodeSLL_2511532007 (value);
		// jika list kosong maka node jadi head
		if (head == null) {
			return newNode_2007;
		}
		// simpan head ke variabel sementara
		NodeSLL_2511532007 last = head;
		// telusuri ke node akhir
		while (last.next_2007 != null) {
			last = last.next_2007;
		}
		//ubah pointer
		last.next_2007 = newNode_2007;
		return head;
	}
	static NodeSLL_2511532007 GetNode (int data_2007) {
		return new NodeSLL_2511532007(data_2007);
	}
	static NodeSLL_2511532007 insertPos (NodeSLL_2511532007 headNode, int position, int value) {
		NodeSLL_2511532007 head = headNode;
		if (position < 1)
			System.out.print("Invalid position");
		if (position == 1) {
			NodeSLL_2511532007 new_node = new NodeSLL_2511532007(value);
			new_node.next_2007 = head;
			return new_node;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					NodeSLL_2511532007 newNode = GetNode(value);
					newNode.next_2007 = headNode.next_2007;
					headNode.next_2007 = newNode;
					break;
				}
				headNode = headNode.next_2007;
			}
			if(position !=1)
				System.out.print("Posisi di luar jngkauan"); }
			return head;
	}
			public static void printList (NodeSLL_2511532007 head) {
				NodeSLL_2511532007 curr = head; 
				while(curr.next_2007 != null) {
					System.out.print(curr.data_2007+"--->");
					curr = curr.next_2007;
				}
	
		
				if (curr.next_2007==null) {
					System.out.print(curr.data_2007);
				}
					System.out.println();
				}
			
			public static void main(String[] args) {
				// buat linked list 2->3->5->6
				NodeSLL_2511532007 head= new NodeSLL_2511532007(2);
				head.next_2007 = new NodeSLL_2511532007(3);
				head.next_2007.next_2007 = new NodeSLL_2511532007(5);
				head.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(6);
				// cetak list asli
				System.out.print("senarai berantai awal:");
				printList(head);
				//tambahkan node baru di depan
				   System.out.print("tambah 1 simpul di depan: ");
				   int data = 1;
				   head = insertAtFront (head, data);
				   //cetak update list
				   printList(head);
				   //tambahkan node baru dibelakang
				   System.out.print("tambah 1 simpul di belakang: ");
				   int data2 = 7;
				   head = insertAtEnd (head, data2);
				   //cetak update list
				   printList(head);
				   System.out.print("tambah 1 simpul ke data ke 4: ");
				   int data3 = 4;
				   int pos = 4;
				   head = insertPos(head,pos,data3);
				   //cetak update list
				   printList(head);
			   }
}
	


