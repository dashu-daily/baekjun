package baekjun.step7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			if(str.contains(arr[i])){
				str = str.replaceAll(arr[i], " ");
			}
		}
		
		System.out.println(str.length());
	}
}
