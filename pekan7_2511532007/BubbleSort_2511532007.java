package pekan7_2511532007;

public class BubbleSort_2511532007 {
	public static void BubbleSort_2511532007 (int [] arr_2007) {
		   int n = arr_2007.length;
		   for (int i = 0; i < n; i++) {
			   for (int j = 0; j < n - i - 1; j++) {
				   if (arr_2007[j] > arr_2007 [j + 1]) {
					   int temp = arr_2007[j];
					   arr_2007[j] = arr_2007[j+1];
					   arr_2007[j+1] = temp;
					   // System.out.println("data:" + arr[j]+" "+arr[j+1]);		   
				   }
			   } 
		   }
	   }
	   public static void main(String[] args) {
		   int arr[] = { 23, 78, 45, 8, 32, 56, 1 };
		   int n = arr.length;
		   System.out.print("Array yang belum terurut:\n");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr[i] + " ");
		   System.out.println ("");
		   //minMaxselectionSort(arr, n);
		   BubbleSort_2511532007(arr);
		   System.out.print("Array yang terurut menggunakan BubbleSort:");
		   for (int i = 0; i < n; i++)
			   System.out.print(arr[i] + " ");
		   System.out.println("");
	   }
	}

