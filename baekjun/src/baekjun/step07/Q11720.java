package baekjun.step07;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		sc.nextLine();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(str.charAt(i)+"");
		}
		
		System.out.println(sum);
	}
}
