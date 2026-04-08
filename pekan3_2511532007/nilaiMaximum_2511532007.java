package pekan3_2511532007;
import java.util.Stack;
public class nilaiMaximum_2511532007 {
	public static int max(Stack<Integer> s_2007) {
	Stack<Integer> backup = new Stack<Integer>();
	int maxValue_2007 = s_2007.pop();
	backup.push(maxValue_2007);
	while (!s_2007.isEmpty()) {
		int next_2007 = s_2007.pop();
		maxValue_2007 = Math.max( maxValue_2007, next_2007);
	}
	while (!backup.isEmpty()) {
		s_2007.push(backup.pop());
		}
	return maxValue_2007;
	}
	public static void main (String[] args) {
		Stack<Integer>s_2007 = new Stack<Integer>();
		s_2007.push(70);
		s_2007.push(12);
		s_2007.push(20);
		System.out.println(s_2007.pop() + "isi stack  "+s_2007);
		System.out.println("Stack teratas " + s_2007.peek());
		System.out.println("Nilai maksimum "+max(s_2007));
	}
}
