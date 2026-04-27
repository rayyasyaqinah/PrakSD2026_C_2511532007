package pekan4_2511532007;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class IterasiQueue_2511532007 {

	public static void main(String[] args) {
		Queue<String> q_2007 =new LinkedList <>();
		q_2007.add("Praktikum");
		q_2007.add("Struktur");
		q_2007.add("Data");
		q_2007.add("Dan");
		q_2007.add("Algoritma");
		Iterator<String> iterator = q_2007.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
