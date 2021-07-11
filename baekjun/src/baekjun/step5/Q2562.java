package baekjun.step5;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int line = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
				line = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(line);
	}

}
