package baekjun.step06;

public class Q4673 {

	public static void main(String[] args) {
		for(int i=1; i<= 10000; i++) {
			boolean selfNum = true;
			
			for(int j=1; j<i; j++) {
				if(d(j) == i) {
					selfNum = false;
					break;
				}
			}
			if(selfNum) System.out.println(i);
		}
	}
	
	public static int d(int n) {
		
		int sum = 0;
		String str = String.valueOf(n);
		
		for(int i=0; i<str.length(); i++) {
			sum += Integer.parseInt(str.charAt(i) + "");
		}
		
		return n + sum;
	}
}
