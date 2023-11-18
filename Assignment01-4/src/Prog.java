import java.util.Scanner;

public class Prog {
	public static int searchIndex(Employee arr[],int id) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid].getId()==id) {
				return mid;
			}
			else if (id>arr[mid].getId()) {
					left = mid + 1;
			}
					else 
						right = mid -1;	
			
		}
		
		return -1;
		
	}
	public static int searchName(Employee arr[],String name) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid].getName().equals(name)) {
				return mid;
			}
			else if (name.compareTo(arr[mid].getName())>0) {
					left = mid + 1;
			}
					else 
						right = mid -1;	
			
		}
		
		return -1;
		
	}
	
	public static int searchSalary(Employee arr[], double salary) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid].getSalary()==salary) {
				return mid;
			}
			else if (salary > arr[mid].getSalary()) {
					left = mid + 1;
			}
					else 
						right = mid -1;	
			
		}
		
		return -1;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee arr[] = {new Employee(1,"lobhas",230000),
				new Employee(2,"Manthan",3000000),
				new Employee(3,"Avdhut",2343553)};
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		int index = searchIndex(arr,id);
		if(index!=-1) {
			System.out.println("Detail of employee by id : "+arr[index]);
		}
		else
			System.out.println("Enter id is not valid");
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		int index2 = searchName(arr,name);
		if(index2!=-1) {
			System.out.println("Detail of employee by id : "+arr[index2]);
		}
		else
			System.out.println("Enter id is not valid");
		
		System.out.println("Enter the salary: ");
		double salary = sc.nextDouble();
		int index3 = searchSalary(arr,salary);
		if(index3!=-1) {
			System.out.println("Detail of employee by id : "+arr[index3]);
		}
		else
			System.out.println("Enter id is not valid");

		

	}

}
