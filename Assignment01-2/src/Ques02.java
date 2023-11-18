import java.util.Scanner;

public class Ques02 {
	public static int linearSearch(int arr[],int key) {
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(key == arr[i]) {
				index = i;
			}
		}
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {22,45,56,78,89,45};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		int index  = linearSearch(arr,key);
		if(index!=-1) {
			System.out.println("Index is found : "+index);
		}
		else
			System.out.println("Enter index is not valid");
		
		

	}

}
