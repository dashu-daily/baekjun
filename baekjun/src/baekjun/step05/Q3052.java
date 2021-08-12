package baekjun.step05;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[42];
		int n = 0;
		
		for(int i=0; i<10; i++) {
			int a = sc.nextInt();
			arr[a %= 42]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) n++;
		}
		
		System.out.println(n);
	}

}
