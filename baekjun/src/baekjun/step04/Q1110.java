package baekjun.step04;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int O = sc.nextInt();
		int i = 0;
		int N = O;

		int a = 0;
		int b = 0;
		
		while(true) {
			a = N / 10;
			b = N % 10;
			N = (b * 10) + ((a + b) % 10);
			
			i++;
			if(O == N) break;
		}
		System.out.println(i);
	}

}
