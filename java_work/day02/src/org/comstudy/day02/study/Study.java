package org.comstudy.day02.study;

import java.util.Scanner;

public class Study {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Integer score = null;
		String plus = null;
		
		System.out.print("������ �Է��ϼ���. -> ");
		score = scan.nextInt();
		
		System.out.println("����� ������");
		
		if (score < 0 || score > 100) {
			System.out.println("Error");
		} else if (score < 60) {
			System.out.println("F");
		} else {
			if (score%10 >= 7 || score/10 == 10) {
				plus = "+";
			} else if (score%10 <= 3) {
				plus = "-";
			} else {
				plus = "";
			}
			
			if (score < 70) {
				System.out.println("D"+plus);
			} else if (score < 80) {
				System.out.println("C"+plus);
			} else if (score < 90) {
				System.out.println("B"+plus);
			} else if (score <= 100) {
				System.out.println("A"+plus);
			}
			
		}

	}
}