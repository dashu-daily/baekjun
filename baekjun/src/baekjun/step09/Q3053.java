package baekjun.step09;

import java.util.Scanner;

public class Q3053 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		double R = in.nextDouble();	// ������ R
		in.close();
		
		System.out.println(R * R * Math.PI);	// ��Ŭ���� ���� ����
		System.out.println(2 * R * R);		// �ýñ����� ���� ����
	}
}
