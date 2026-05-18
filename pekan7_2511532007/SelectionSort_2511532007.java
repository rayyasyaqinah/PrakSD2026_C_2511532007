package pekan7_2511532007;

public class SelectionSort_2511532007 {
	public static void SelectionSort_2511532007 (int[] arr_2007) {
		int n = arr_2007.length;
		 for (int i = 1; i < n; i++) {
			 int minIndex = i;
			 for (int j = i + 1; j < n; j++) {
				 if (arr_2007[j] < arr_2007[minIndex]) {
					 minIndex = j;
				 }
			 }
			 int temp = arr_2007[i];
			 arr_2007[i] = arr_2007[minIndex];
			 arr_2007[minIndex] = temp;
		 }
	}

	public static void main(String[] args) {
		   int arr_2007[] = { 23, 78, 45, 8, 32, 56, 1 };
		   int n = arr_2007.length;
		   System.out.printf("Array yang belum terurut:\n");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr_2007[i] + " ");
		   System.out.println ("");
		   SelectionSort_2511532007(arr_2007);
		   System.out.printf("Array yang terurut:\n");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr_2007[i] + " ");
		   System.out.println("");

	}

}
