import java.util.Scanner;
//Implement binary search algorithm if array is sorted in descending order.
public class prog {
	public static int binarySearch(int arr[],int key) {
		int left = 0;
		int right = arr.length-1;
		int nobinary = 0;
		while(left<=right) {
			nobinary++;
			int mid = (left+right)/2;
			if(arr[mid]==key) {
				return nobinary;
			}
			else if (key<arr[mid]) {
					left = mid + 1;
			}
					else 
						right = mid -1;
				
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {95,87,66,54,34,23,13};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		int bicomp = binarySearch(arr,key);
		if(bicomp!=-1) {
			System.out.println("Comparision is found : "+bicomp);
		}
		else
			System.out.println("Enter index is not valid");

	}

}
