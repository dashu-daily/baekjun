package baekjun.step07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		int a = Integer.parseInt("" + A.charAt(2) + A.charAt(1) + A.charAt(0));
		int b = Integer.parseInt("" + B.charAt(2) + B.charAt(1) + B.charAt(0));
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
	}
}
