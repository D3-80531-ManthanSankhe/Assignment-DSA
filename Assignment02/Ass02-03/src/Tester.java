import java.util.Arrays;
import java.util.Scanner;

public class Tester {
	public static void insertionSort(Employee arr[],int n) {
		for( int i=1;i<n;i++) {
		    double temp = arr[i].getSalary();
		    Employee temp1 = arr[i];
			int j;
			for(j=i-1;j >= 0 && arr[j].getSalary() > temp;j--) {
				arr[j+1]=arr[j];
				
			}
			arr[j+1] = temp1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of employee :");
		int size = sc.nextInt();
		Employee emp[]=new Employee[size];
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter the id,name,salary");
			emp[i] = new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		}
			insertionSort(emp,size);
			System.out.println("Enter the sort salary: " + Arrays.toString(emp));
		

	}

}
