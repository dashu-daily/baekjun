package baekjun.step03;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N]; 
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int j=0; j<N; j++) {
			if(A[j] < X) {
				System.out.print(A[j] + " ");
			}
		}
	}

}
