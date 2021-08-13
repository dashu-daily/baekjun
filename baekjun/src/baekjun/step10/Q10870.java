package baekjun.step10;

import java.util.Scanner;

public class Q10870 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int arr[] = new int[n+1];
//		arr[0] = 0;
//		arr[1] = 1;
//		
//		for(int i=2; i<arr.length; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		
//		System.out.println(arr[n]);
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
	 
//		int[] fibonacci = new int[N + 1];	
// 
//		for(int i = 0; i < fibonacci.length; i++) {
//			if(i == 0) fibonacci[0] = 0;
//			else if(i == 1) fibonacci[1] = 1;            
//			else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//		}
        
//		System.out.println(fibonacci[N]);
		
		System.out.println(f(N));
	}
	
	public static int f(int n) {
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		}else {
			return f(n-1) + f(n-2);
		}
	}
}
