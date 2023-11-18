import java.util.Scanner;

public class prog {
	public static int rankSearch(int arr[],int key) {
		int count =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(key>=arr[i]) {
				count++;
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the ele to find  which is greater than other:");
		int key = sc.nextInt();
		int rank = rankSearch(arr,key);
		if(rank!=-1) {
			System.out.println("Enter the rank of the ele: "+rank);
		}
		else 
			System.out.println("Index is not validate");

	}

}
