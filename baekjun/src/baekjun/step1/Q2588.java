package baekjun.step1;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = A * (B % 10);
		int D = A * ((B % 100) / 10);
		int E = A * (B / 100);
		int F = C + (D * 10) + (E * 100);
		
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
	}

}
