package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	/*
	팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요.
	5 입력시 1*2*3*4*5 의 값이 출력됩니다.
	7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
	팩토리얼공식  n!= 1×2 ×3× ⋯ ×n
	*/
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int c=1;

		for(int b=1; b<=a;b++) {
			
			c=c*b;
		}System.out.println(c);
		
		
		sc.close();
	}

}
