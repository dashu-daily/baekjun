package baekjun.step8;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int X = in.nextInt();
//		
//		int count = 1, sum = 0, cnt_in_row = 0;
//		
//		while (sum < X) {
//			count++;
//			cnt_in_row = X - sum - 1;
//			sum += count;
//		}
//		
//		System.out.println(cnt_in_row);
//		int a = 0, b = 0;
//		if(count % 2 == 0) {
//			
//		}
		int line = 0; 
		int cnt = 0; 
		int n = sc.nextInt();
		
		while(cnt < n) {
			line++; 
			cnt = line * (line+1) / 2; 
		} 
		
		if( line % 2 != 0) { 
			int top = 1+(cnt-n); 
			int bottom = line - (cnt-n); 
			System.out.println(top+"/"+bottom); 
		}else { 
			int top = line - (cnt - n); 
			int bottom = 1 + (cnt - n); 
			System.out.println(top+"/"+bottom); 
		}

	}
}
