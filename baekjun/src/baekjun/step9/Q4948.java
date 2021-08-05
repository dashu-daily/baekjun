package baekjun.step9;

import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == 0) break;
			int cnt = 0;
			
			for(int i=n+1; i<=2*n; i++) {
				int j;
				for(j=2; j*j<=i; j++) {
					if(i % j == 0) break;
				}
				if((j*j >i) == (i != 1)) cnt++;
			}
			System.out.println(cnt);
		}
	}
}
