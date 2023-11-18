import java.util.Scanner;

public class Prog {
	public static int nonRepeating(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					continue;
				if(arr[i]==arr[j]) {
					 flag =true;
					 break;
				}
				
			}
			if(flag == false) 
				return arr[i];
		}
		return -2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		Scanner sc = new Scanner(System.in);
		int index  = nonRepeating(arr);
		if(index!=-2) {
		System.out.println("Non reapeating element is : "+index);
		}
		else
			System.out.println("Index is not found");
	}

}
