package baekjun.step06;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(d(N));
	}
	
	public static int d(int n) {
		int count = 0;
		
		if(n < 100) {
			return n;
		} else {
			count = 99;
			if(n == 1000) n = 999;
			for(int i=100; i<=n; i++) {
				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;
				if((a - b) == (b - c)) count++;
			}
		}
		return count;
	}
}
