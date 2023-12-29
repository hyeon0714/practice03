package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		/*
		아래와 설명에 맞는 프로그램을 작성하세요
		숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
		예를들어 22을 입력한 경우 5의배수 개수: 4,  5의배수 합: 50 이 출력된다.
		-	5의배수 개수 : 5, 10, 15, 20  4개
		-	5의배수 합   : 5+10+15+20  50
		*/
		
		System.out.print("숫자를 입력해주세요:");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=0;
		int c=0;
		
		for(int d=1; d<=a; d++) {
			if(d%5==0) {
			b=b+d;
			c=c+1;
			}
		}
		System.out.println("5의 배수의 개수:" +c);
		System.out.println("5의 배수의 합:"+b);
		
		sc.close();
	}

}
