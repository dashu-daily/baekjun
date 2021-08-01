package baekjun.step9;

import java.util.Scanner;

public class Q4153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;

			if((a*a) + (b*b) == c*c) System.out.println("right");
			else if((b*b) + (c*c) == a*a) System.out.println("right");
			else if((c*c) + (a*a) == b*b) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
