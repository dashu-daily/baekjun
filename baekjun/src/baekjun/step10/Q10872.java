package baekjun.step10;

import java.util.Scanner;

public class Q10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(f(N));
	}
	
	public static int f(int n) {
		if(n == 0) return 1;
		else return f(n-1) * n;
	}
}
