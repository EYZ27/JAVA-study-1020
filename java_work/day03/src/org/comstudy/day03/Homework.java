package org.comstudy.day03;

import java.util.Scanner;
import java.util.ArrayList;

class Person {
	private String name;
	private int age;
	private String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

}

class AddressBook {
	private ArrayList<Person> persons;

	public AddressBook() {
		this.persons = new ArrayList<>();
	}

	public void addPerson() {
		// 기능 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		String newName = sc.next(); 
		
		System.out.println("나이 입력: ");
		int newAge = sc.nextInt();
		
		System.out.println("주소 입력: ");
		String newAdd = sc.next();
		
//		sc.close();
		
		persons.add(new Person(newName, newAge, newAdd));
	}

	public void displayPersons() {
		// 기능 구현
		for (int i=0;i<=persons.size();i++) {
			System.out.println(persons.get(i));
		}
	}

	public void searchPerson() {
// 기능 구현
	}

	public void editPerson() {
// 기능 구현
	}

	public void deletePerson() {
// 기능 구현
	}
}

public class Homework {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===================== MENU ======================");
			System.out.println("(1)연락처 추가 (2) 목록 출력 (3) 검색 (4) 수정 (5) 삭제 (6) 종료");

			System.out.print("선택: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline
			
			switch (choice) {
			case 1:
				addressBook.addPerson();
				break;
			case 2:
				addressBook.displayPersons();
				break;
			case 3:
				addressBook.searchPerson();
				break;
			case 4:
				addressBook.editPerson();
				break;
			case 5:
				addressBook.deletePerson();
				break;
			case 6:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice! Please choose again.");
//			sc.close();
			}
		}

	}
}
