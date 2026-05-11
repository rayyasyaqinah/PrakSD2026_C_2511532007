package pekan6_2511532007;

public class InsertDLL_2511532007 {
	//menambahkan node di awal DLL
	static NodeDLL_2511532007 insertBegin(NodeDLL_2511532007 head_2007, int data_2007) {
		// nuat node baru
		NodeDLL_2511532007 new_node = new NodeDLL_2511532007(data_2007);
		// jadikan pointer nextnya head
		new_node.next_2007 = head_2007;
		// jadikan pointer prev head ke new node
		if (head_2007 !=null) {
			head_2007.prev_2007 = new_node;
		}
		return new_node;
	}
	//fungsi menambahkan node di akhir
	public static NodeDLL_2511532007 insertEnd(NodeDLL_2511532007 head_2007, int newData_2007) {
		//buat node baru
		NodeDLL_2511532007 newNode = new NodeDLL_2511532007(newData_2007);
		//jika dll null jadikan head
		if (head_2007 == null) {
			head_2007 = newNode;
		}
		else {
			NodeDLL_2511532007 curr_2007 = head_2007;
			while (curr_2007.next_2007 != null) {
				curr_2007 = curr_2007.next_2007;
			}
			curr_2007.next_2007 = newNode;
			curr_2007 =curr_2007.next_2007;
			}
		return head_2007;
		}
	
	// fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532007 insertAtPosition(NodeDLL_2511532007 head_2007, int pos_2007, int new_data_2007) {
		//buat node baru
		NodeDLL_2511532007 new_node = new NodeDLL_2511532007(new_data_2007);
		if (pos_2007 == 1) {
			new_node.next_2007 = head_2007;
			if (head_2007!= null) {
				head_2007.prev_2007 = new_node; }
			head_2007 = new_node;
			return head_2007; }
			NodeDLL_2511532007 curr_2007 = head_2007;
			for (int i = 1; i < pos_2007 - 1 && curr_2007 != null; ++i) {
				curr_2007 = curr_2007.next_2007; }
			if (curr_2007 == null) {
				System.out.println("posisi tidak ada");
				return head_2007; }
				new_node.prev_2007 = curr_2007;
				new_node.next_2007 = curr_2007.next_2007;
				curr_2007.next_2007 = new_node;
				if (new_node.next_2007 != null) {
					new_node.next_2007.prev_2007 = new_node; }
				return head_2007;	
					}
		
		public static void printList(NodeDLL_2511532007 head_2007) {
			NodeDLL_2511532007 curr_2007 = head_2007;
			while (curr_2007 != null) {
				System.out.print(curr_2007.data_2007 + "<->");
				curr_2007 = curr_2007.next_2007;
				}
					System.out.println();
	}
		public static void main(String[] args) {
			//membuat dll 2 <-> 3 <-> 5
			NodeDLL_2511532007 head_2007 = new NodeDLL_2511532007(2);
			head_2007.next_2007 = new NodeDLL_2511532007(3);
			head_2007.next_2007.prev_2007 = head_2007;
			head_2007.next_2007.next_2007 = new NodeDLL_2511532007(5);
			head_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007;
			// cetak DLL awal
			System.out.print("DLL Awal: ");
			printList(head_2007);
			//tambah diawal
			head_2007 = insertBegin(head_2007, 1);
			System.out.print(
					"simpul 1 ditambah diawal: ");
			printList(head_2007);
			// tambah diakhir
			System.out.print(
					"simpul ditambah di akhir");
			int data_2007 = 6;
			head_2007 = insertEnd(head_2007, data_2007);
			printList(head_2007);
			// menambah node 4 di posisi 4
			System.out.print("tambah node 4 di posisi 4: ");
			int data2 = 4;
			int pos_2007 = 4;
			head_2007 = insertAtPosition(head_2007, pos_2007, data2);
			printList(head_2007);
		}
	}
