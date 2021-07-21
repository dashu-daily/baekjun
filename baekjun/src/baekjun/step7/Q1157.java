package baekjun.step7;

import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = (sc.next()).toUpperCase();
		sc.nextLine();
		
		int arr[] = new int[26];

		for(int i=0; i<str.length(); i++) {
			arr[(int)(str.charAt(i)-65)]++;
		}
		
		int max = 0;
		for(int j=0; j<arr.length; j++) {
			if(max < arr[j]) max = arr[j];
		}
		
		int count = 0;
		int index = 0;
		for(int j=0; j<arr.length; j++) {
			if(max == arr[j]) {
				index = j;
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("?");
		}else{
			System.out.println((char)(index+65));
		}
	}
}
