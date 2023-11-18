
public class Prog {
	 public static int selectionSort(int[] arr) {
	        int comparisons = 0;
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;

	            for (int j = i + 1; j < n; j++) {
	            	comparisons++;

	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	        return comparisons;
	 }

		public static void main(String[] args) {
	        int[] array = {64, 25, 12, 22, 11};
	        
	        int comparisons = selectionSort(array);
	        
	        System.out.print("Sorted array: ");
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println("\nNumber of comparisons: " + comparisons);
	    }

	}
