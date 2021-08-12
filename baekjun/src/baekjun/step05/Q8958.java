package baekjun.step05;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		int[] score = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
			sc.nextLine();
			
			int[] sum = new int[arr[i].length()];
			
			if(arr[i].charAt(0) == 'O') sum[0] = 1;
			score[i] = sum[0];
			
			for(int j=1; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') sum[j] = sum[j-1] + 1;
				else sum[j] = 0;
				score[i] += sum[j];
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(score[i]);
		}
	}

}
