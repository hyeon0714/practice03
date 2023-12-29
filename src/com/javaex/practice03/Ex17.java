package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {
	
	//숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요:");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		for(int b=0; b<=a+1; b++) {//세로
			for(int c=b-0; c<=a; c++) {//가로
				System.out.print("*");
			}
			
			System.out.println("*");
			
		}
		
		
		sc.close();
	}

}
