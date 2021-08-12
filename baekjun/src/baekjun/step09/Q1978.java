package baekjun.step09;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			boolean tf = true;
			for(int j=2; j<num; j++) {
				if(num % j == 0) {
					tf = false;
					break;
				}
			}
			if(num > 1 && tf) cnt++;
		}
		
		System.out.println(cnt);
	}
}
