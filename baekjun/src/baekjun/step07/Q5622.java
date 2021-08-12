package baekjun.step07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int a = 0;

		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			case 'A' : case 'B' : case 'C' :
				a += 3; 
				break;
			case 'D' : case 'E' : case 'F' :
				a += 4; 
				break;
			case 'G' : case 'H' : case 'I' :
				a += 5; 
				break;
			case 'J' : case 'K' : case 'L' :
				a += 6; 
				break;
			case 'M' : case 'N' : case 'O' :
				a += 7; 
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :
				a += 8; 
				break;
			 case 'T' : case 'U' : case 'V' :
				a += 9; 
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				a += 10; 
				break;
			}
		}
		
		System.out.println(a);
	}
}
