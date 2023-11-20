import java.util.Arrays;

public class Comp {
	public static int insertionSort(int arr[],int n) {
		int count=0;
		for( int i=1;i<n;i++) {
			int temp = arr[i];
			int j;
			for(j=i-1;j >= 0 && arr[j] > temp;j--) {
				count++;
				arr[j+1]=arr[j];
				
			}
			arr[j+1] = temp;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {55, 44, 22, 66, 11, 33};
		System.out.println("array before sort"+Arrays.toString(arr));
		int sort = insertionSort(arr,arr.length);
		System.out.println("array after sort:"+sort);

	}

}
