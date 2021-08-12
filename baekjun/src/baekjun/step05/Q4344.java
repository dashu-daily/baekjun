package baekjun.step05;

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int[] arr = new int[C];
		double[] result = new double[C];
		
		for(int i=0; i<C; i++) {
			arr[i] = sc.nextInt();
			int avg = 0;
			
			int[] score = new int[arr[i]];
			
			for(int j=0; j<arr[i]; j++) {
				score[j] = sc.nextInt();
				avg += score[j];
			}
			
			avg /= arr[i];
			
			double num = 0;
			for(int j=0; j<arr[i]; j++) {
				if(score[j] > avg) num += 1;
			}
			
			result[i] = num / arr[i];
			System.out.println(String.format("%.3f", result[i] * 100) + "%");
		}
		
	}

}
