package baekjun.step08;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int A = N % H;
			int B = 0;
			if(A == 0) {
				A = H;
				B = N / H;
			}else {
				B = (N / H) + 1;
			}
			System.out.println((A * 100) + B);
		}
	}
}
