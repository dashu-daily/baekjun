package baekjun.step9;

import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
	
			int a = n / 2;
			int b = n / 2;
			
			while(!isPrime(a) || !isPrime(b)) {
				a--;
				b++;
			}
			System.out.println(a + " " + b);
		}
	}
	
	public static boolean isPrime(int num) {
		boolean tf = true;
		for(int i=2; i<num-1; i++) {
			if(num % i == 0) {
				tf = false;
				break;
			}
		}
		return tf;
	}
}
