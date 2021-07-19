package baekjun.step7;

import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.nextLine();
		
		int[] arr = new int[26];
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
			arr[i] = s.indexOf(i + 97);
			
			System.out.print(arr[i] + " ");
		}
	}
	
}
