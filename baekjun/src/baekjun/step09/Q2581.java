package baekjun.step09;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = 0;
		int sum = 0;
		
		for(int i=M; i<=N; i++) {
			boolean tf = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					tf = false;
					break;
				}
			}
			
			if(i != 1 && tf && sum == 0) min = i;
			if(i != 1 && tf) sum += i;
		}
		
		if(min == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
