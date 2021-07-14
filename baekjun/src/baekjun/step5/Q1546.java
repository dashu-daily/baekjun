package baekjun.step5;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] arr = new double[N];
		double M = 0;
		double result = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			result += arr[i];
			if(M < arr[i]) M = arr[i];
		}
		
		System.out.println((result / M * 100) / N);
	}

}
