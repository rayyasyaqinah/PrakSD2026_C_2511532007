package pekan3_2511532007;
import java.util.Scanner;
import java.util.Stack;
public class stackPostfix_2511532007 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s_2007 = new Stack<Integer>();
		Scanner input = new Scanner (expression);
		while (input.hasNext()) { 
			if (input.hasNextInt()) { // an operand integer
				s_2007.push(input.nextInt());
			} else {
				String operator = input.next();
				int operand2_2007 = s_2007.pop();
				int operand1_2007 = s_2007.pop();
				if (operator.equals("+")) {
					s_2007.push(operand1_2007 + operand2_2007);
				} else if (operator.equals("-")) {
						s_2007.push(operand1_2007 - operand2_2007);
					} else if (operator.equals("*")) {
						s_2007.push(operand1_2007 * operand2_2007);
						} else {
						s_2007.push(operand1_2007 / operand2_2007);
					}
				}
			}
			input.close();
			return s_2007.pop();
		}
		public static void main (String[] args) {
			System.out.println("hasil postfix= " +postfixEvaluate("5 2 4 * + 7 -"));
	}
}
