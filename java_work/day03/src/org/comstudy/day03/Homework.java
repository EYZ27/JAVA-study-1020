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
		// ��� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է�: ");
		String newName = sc.next(); 
		
		System.out.println("���� �Է�: ");
		int newAge = sc.nextInt();
		
		System.out.println("�ּ� �Է�: ");
		String newAdd = sc.next();
		
//		sc.close();
		
		persons.add(new Person(newName, newAge, newAdd));
	}

	public void displayPersons() {
		// ��� ����
		for (int i=0;i<=persons.size();i++) {
			System.out.println(persons.get(i));
		}
	}

	public void searchPerson() {
// ��� ����
	}

	public void editPerson() {
// ��� ����
	}

	public void deletePerson() {
// ��� ����
	}
}

public class Homework {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===================== MENU ======================");
			System.out.println("(1)����ó �߰� (2) ��� ��� (3) �˻� (4) ���� (5) ���� (6) ����");

			System.out.print("����: ");
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