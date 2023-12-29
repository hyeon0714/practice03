package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {
	/*
	13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요.
	
	*/
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int b=0;
		
		int d=0;
		

		for(int c=1; c<=a; c++) {//세로
			
			d=d+c;
			for(b=1; b<=a-1; b++) {
				
				System.out.print(b+"+");

			

			
		}				System.out.print(a);
		System.out.println("");
	
		}System.out.println("합계: "+d);
		sc.close();
	}
	
}

