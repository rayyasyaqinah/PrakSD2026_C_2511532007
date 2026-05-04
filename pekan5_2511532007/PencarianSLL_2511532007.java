package pekan5_2511532007;

public class PencarianSLL_2511532007 {
	static boolean searchKey (NodeSLL_2511532007 head, int key) {
		NodeSLL_2511532007 curr = head;
		while (curr != null) {
			if(curr.data_2007 == key)
				return true;
			curr = curr.next_2007; }
		return false; }
	public static void traversal(NodeSLL_2511532007 head) {
		// mulai dari head
		NodeSLL_2511532007 curr = head;
		// telusuri sampai pointer null
		while (curr != null) {
			System.out.print(" " + curr.data_2007);
			curr = curr.next_2007; }
		System.out.println(); }
		public static void main(String[] args) {
			NodeSLL_2511532007 head = new NodeSLL_2511532007(14);
			head.next_2007 = new NodeSLL_2511532007(21);
			head.next_2007.next_2007 = new NodeSLL_2511532007(13);
			head.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(30);
			head.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2511532007(10);
			System.out.print("Penelusuran SLL : ");
			traversal(head);
			// data yang akan dicari
			int key = 30;
			System.out.print("cari data " +key+ " = "); 
			if (searchKey(head, key))
				System.out.println("ketemu");
			else
				System.out.println("tidak ada");
			
		}
	}


