package baekjun.step05;

import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int num = A * B * C;
		
		while(true) {
			int x = num % 10;
			num /= 10;
			
			for(int i=0; i<10; i++) {
				if(x == i) arr[i]++;
			}
			
			if(num < 10) {
				for(int i=0; i<10; i++) {
					if(num == i) arr[i]++;
				}
				break;
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}

}
