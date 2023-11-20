import java.util.Scanner;

public class Priority {
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element1: ");
		String ele1 = sc.next();
		System.out.println("Enter the element2: ");
		String ele2 = sc.next();
		
		char one = ele1.charAt(0);
		char two = ele2.charAt(0);
		
		if(priority(one)>priority(two)) {
			System.out.println("Enter the greater element: "+ele1);

		}
		else {
			System.out.println("Enter the greater element: "+ele2);
		}

	}

}
