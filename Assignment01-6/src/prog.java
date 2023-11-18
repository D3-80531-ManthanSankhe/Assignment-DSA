import java.util.Scanner;

public class prog {
	public static int linearSearch(int arr[],int key,int occurance) {
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(key == arr[i]) {
				count++;
				if(count == occurance)
					return i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {22,45,56,78,89,45};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		System.out.println("Enter the occurance: ");
		int occurance = sc.nextInt();
		int count  = linearSearch(arr,key,occurance);
		if(count!=-1) {
			System.out.println("Occurance  is found"+occurance+" and in that index : "+count);
		}
		else
			System.out.println("Enter index is not valid");

	}

}
