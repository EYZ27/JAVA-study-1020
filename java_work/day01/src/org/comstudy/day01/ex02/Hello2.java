package org.comstudy.day01.ex02;

import java.util.Scanner;

class Person {
	int id;
	String name;
	String email;
	int age;
}

public class Hello2 {
	
	static Person[] person = null;
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		person = new Person[5];
		
		for (int i=0;i<5;i++) {
			person[i] = new Person();
			System.out.println("Person"+(i+1)+"�Է�");
			System.out.print("ID �Է�: ");
			person[i].id = scan.nextInt();
			System.out.print("�̸� �Է�: ");
			person[i].name = scan.next();
			System.out.print("email �Է�: ");
			person[i].email = scan.next();
			System.out.print("���� �Է�: ");
			person[i].age = scan.nextInt();
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<5;i++) {
		System.out.printf((i+1)+"��°: ID %d, �̸� %s, email %s, ���� %d\n",
				person[i].id, person[i].name, person[i].email, person[i].age);
		}
	}
}
