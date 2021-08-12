package baekjun.step09;

import java.util.Scanner;

public class Q1929 {

	public static boolean[] isPrime;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		isPrime = new boolean[N+1];
		
		isPrime[1] = true;
		for(int i=2; i<=Math.sqrt(N+1); i++) {
			for(int j=i*i; j<N+1; j+=i) {
				isPrime[j] = true;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(!isPrime[i]) System.out.println(i);
		}
	}
}
