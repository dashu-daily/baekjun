package baekjun.step1;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45) {
			M -= 45;
		}else {
			M += 15;
			if(H == 0) {
				H = 23;
			}else {
				H -= 1;
			}
		}
		
		System.out.println(H + " " + M);
	}

}
