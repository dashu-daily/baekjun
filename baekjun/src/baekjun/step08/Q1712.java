package baekjun.step08;

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
 
		int A = in.nextInt();	// �Һ� ���
		int B = in.nextInt();	// ���� ���
		int C = in.nextInt(); 	// ��ǰ ����
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}
	}
}
