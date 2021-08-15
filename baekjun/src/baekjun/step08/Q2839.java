package baekjun.step08;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		int total = 0;
		while(true) {
			if(N % 5 == 0) {
				total = N / 5;
				break;
			} else if(N < 0){
				total = -1;
				cnt = 0;
				break;
			}
			N = N - 3;
			cnt++;
		}
		System.out.println(cnt + total);
	}
}
