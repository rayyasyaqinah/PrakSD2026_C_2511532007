package pekan4_2511532007;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532007 {
	public static void main(String[] args) {
	Queue<Integer> q_2007 = new LinkedList<Integer>();
	q_2007.add(1);
	q_2007.add(2);
	q_2007.add(3); // [1, 2, 3]
	System.out.println("sebelum reverse= " + q_2007);
	Stack<Integer> s_2007 = new Stack<Integer>();
	while (!q_2007.isEmpty()) { // Q -> S
		s_2007.push(q_2007.remove());
	}
	while (!s_2007.isEmpty()) { // S -> Q
		q_2007.add(s_2007.pop());
	}
	System.out.println("sesudah reverse= " +q_2007); // [3, 2, 1]
	}

}
