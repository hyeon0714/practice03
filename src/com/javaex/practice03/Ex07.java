package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {
	
	//숫자를 입력받아 아래와 같이 출력하세요
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc=new Scanner(System.in);
		
		
		int a = sc.nextInt();
		
		for(int b=1; b<=a; b++) {
			
			for(int c=2; c<=b; c++) {
				System.out.print(b);
			}
			
			
			System.out.println(b);
		}
		
		
		
		
		sc.close();
	}

}
