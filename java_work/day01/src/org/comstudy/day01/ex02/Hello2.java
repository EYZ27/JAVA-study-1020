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
			System.out.println("Person"+(i+1)+"입력");
			System.out.print("ID 입력: ");
			person[i].id = scan.nextInt();
			System.out.print("이름 입력: ");
			person[i].name = scan.next();
			System.out.print("email 입력: ");
			person[i].email = scan.next();
			System.out.print("나이 입력: ");
			person[i].age = scan.nextInt();
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<5;i++) {
		System.out.printf((i+1)+"번째: ID %d, 이름 %s, email %s, 나이 %d\n",
				person[i].id, person[i].name, person[i].email, person[i].age);
		}
	}
}
