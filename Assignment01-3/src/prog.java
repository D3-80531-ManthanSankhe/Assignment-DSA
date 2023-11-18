import java.util.Scanner;

public class prog {
//	public static int linearSearch(int arr[],int key) {
//		int comp = 0;
//		for(int i = 0;i<arr.length;i++) {
//			comp++;
//			if(key == arr[i]) {
//				return comp++;
//			
//			}
//		}
//		return -1;
//		
//	}
	
	public static int binarySearch(int arr[],int key) {
		int left = 0;
		int right = arr.length;
		int nobinary = 0;
		while(left<=right) {
			nobinary++;
			int mid = (left+right)/2;
			if(arr[mid]==key) {
				return nobinary;
			}
			else if (key>arr[mid]) {
					left = mid + 1;
			}
					else 
						right = mid -1;
				
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {22,45,56,78,89,45};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
//		int comp  = linearSearch(arr,key);
//		if(comp!=-1) {
//			System.out.println("Comparision is found : "+comp);
//		}
//		else
//			System.out.println("Enter index is not valid");
//		
		int bicomp = binarySearch(arr,key);
		if(bicomp!=-1) {
			System.out.println("Comparision is found : "+bicomp);
		}
		else
			System.out.println("Enter index is not valid");

	}
		

	}

