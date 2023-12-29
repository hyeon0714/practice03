package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {
	
	//숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		for(int b=1; b<=a; b++) {
			for(int c=0; c<=a-b; c++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		for(int b=a; b>=0; b--) {
			for(int c=1; c<=a-b; c++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
		sc.close();
	}

}
