package org.comstudy.day01.ex01;

import java.util.Scanner;

// Ŭ������ ��ü�� ����� ���� ���� Ʋ�̴�.
public class Hello {
   // (Ŭ������)��� �ʵ� ����
   // �ڹٴ� ������ �����Ҷ� ������ Ÿ���� ǥ�� �ؾ� �Ѵ�.
   static final Scanner scan = new Scanner(System.in);
   static final Scanner scanline = new Scanner(System.in);
   // Ŭ������ ������� �޼���� �ʵ尡 �ִ�.
   // ������� static�� ���̴� �Ͱ� static�� �� ���̴°��� �ִ�.
   // ��� �޼���
   public static void main(String[] args) {
      // (�޼�����)����(����)����: ���� ������ �ʱ�ȭ �ʼ�
      String name = "ȫ�浿";
      String address = "����� �߱�";
      Integer age = 25;
      
      // �̸�, �ּ�, ���� �Է�
      System.out.print("���� �Է�: ");
      name = scan.next();
      System.out.print("�ּ� �Է�: ");
      address = scanline.nextLine();
      System.out.print("���� �Է�: ");
      age = scan.nextInt();
      
      System.out.println("Hello world");
      System.out.println("����: " + name);
      System.out.println("�ּ�: " + address);
      System.out.println("����: " + age);
   }
}

// �ɼ������� (������ ������ ſ���� �ʴ´�)