package pekan3_2511532007;

public class stackArray_2511532007 {
	static final int MAX_2007 = 1000;
	int top;
	int a[] = new int [MAX_2007];
	boolean isEmpty_2007()
	{
		return (top < 0);
	}
	stackArray_2511532007()
	{
		top = -1;
	}
	boolean push(int x)
	{
		if (top >= (MAX_2007 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
		}
		else {
			int x = a[top--];
			return x;
		}
		return top;
	}
	 int peek()
	 {
		 if (top < 0) {
			 System.out.println("Stack Underflow");
			 return 0;
		 }
		 else {
			 int x = a[top];
			 return x;
		 }
	 }
	 void print() {
		 for(int i = top;i > -1;i--) {
			 System.out.print(" " +a[i]);
		 }
	 }
}


	
