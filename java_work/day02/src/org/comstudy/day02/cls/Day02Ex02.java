package org.comstudy.day02.cls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day02Ex02 {
	   
	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      int startDan = 2;
	      int endDan = 9;
	      
	      startDan = getDan("����");
	      endDan = getDan("����");

	      
	      if (startDan > endDan) {
	    	  int tmpDan = startDan;
	    	  startDan = endDan;
	    	  endDan = tmpDan;
	      }
	      
	      for (int i=startDan; i<=endDan; i+=3) {
	    	  if (i+2 > endDan) { gugudan(i, endDan); }
	    	  else { gugudan(i, i+2); }
	    	  System.out.println();
    	  }
	      
	      
//	      for(int dan=startDan; dan<=endDan; dan++) {         
//	         System.out.printf("-%d��-\n", dan);
//	         for(int cnt=1; cnt<=9; cnt++) {            
//	            System.out.printf("%d*%d=%d\n", dan, cnt, dan*cnt);
//	         }
	      }
	   
	   
	   public static void gugudan(int startDan, int endDan) {
	      // ������ ���
		   for(int dan=startDan; dan<=endDan; dan++) {
			   System.out.printf("**%d��**\t", dan);
		   }
		   System.out.println();
	       for(int cnt=1; cnt<=9; cnt++) {
	          for(int dan=startDan; dan<=endDan; dan++) {
	             System.out.printf("%d*%d=%d\t", dan, cnt, dan*cnt);
	          }
	          System.out.println();
	       }
	   }
	   
	   public static int getDan(String name) {
		   Scanner scan = new Scanner(System.in);
		   int dan;
		   do {
		         while(true) {
		            try {
		               System.out.printf("%s ��: ", name);
		               dan = scan.nextInt();
		               break;
		            } catch (InputMismatchException e) {
		               System.out.println("�ٽ� �Է����ּ���.");
		               scan.next(); // ���ۿ� �Էµ� �߸��� ������ ����
		               continue;
		            }
		         }
		      } while(dan<1 || dan>9);
		   return(dan);

	   }
	}