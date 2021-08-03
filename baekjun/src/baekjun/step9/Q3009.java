package baekjun.step9;

import java.util.Scanner;

public class Q3009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] xPoint = new int[3];
		int[] yPoint = new int[3];
		int x = 0;
		int y = 0;
		
		for(int i=0; i<3; i++) {
			xPoint[i] = sc.nextInt();
			yPoint[i] = sc.nextInt();
		}
		
		if(xPoint[0] == xPoint[1]) {
			x = xPoint[2];
		}else if(xPoint[0] == xPoint[2]) {
			x = xPoint[1];
		}else {
			x = xPoint[0];
		}
		
		if(yPoint[0] == yPoint[1]) {
			y = yPoint[2];
		}else if(yPoint[0] == yPoint[2]) {
			y = yPoint[1];
		}else {
			y = yPoint[0];
		}
		
		System.out.println(x + " " + y);
	}
}
