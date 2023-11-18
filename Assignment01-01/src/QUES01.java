// WAY 01
//public class QUE01 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string ...");
//		String str = sc.next();
//		boolean result = checkPalin(str);
//		System.out.println(result);
//		sc.close();
//	}
//	
//	public static boolean checkPalin(String str) {
//		char[] ch = str.toCharArray();
//		int start,end = 0;
//		start = 0;
//		end = ch.length - 1;
//		while(start <= end) {
//			if(ch[start] != ch[end]) {
//				return false;
//			}
//			else {
//				start++;
//				end--;
//			}
//		}
//		return true;
//	}
//}

////WAY 02
//public class QUE01 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the string ...");
//	String str = sc.next();
//	boolean result = checkPalin(str);
//	System.out.println(result);
//	sc.close();
//}
//
//public static boolean checkPalin(String str) {
//	StringBuffer sb = new StringBuffer(str);
//	StringBuffer sbrev = sb.reverse();
//	if(str.contains(sbrev.toString())) {
//		return true;
//	}
//	return false;
//}
//}

//WAY 03

//public class QUE01 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the string ...");
//	String str = sc.next();
//	boolean result = checkPalin(str,0,str.length()-1);
//	System.out.println(result);
//	sc.close();
//}
//
//public static boolean checkPalin(String str,int start,int end) {
//	if(start > end ) {
//		return true;
//	}
//	else {
//		if(str.charAt(start) != str.charAt(end)) {
//			return false;
//		}
//		return checkPalin(str,++start,--end);
//	}
//}
//}


