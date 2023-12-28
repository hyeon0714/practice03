package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {
	/*
	다음과 같은 프로그램을 작성하세요
	a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
	- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
	b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
	    - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
	 */
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int c=0;
		int d=0;
		
		if(a%2>0) {
			for(int b=1; b<=a; b=b+2) {
				c = c+b;
			}System.out.println("결과값: "+c);
		}else if(a%2==0) {
			for(int b=2;b<=a;b=b+2) {
				d=d+b;
			}System.out.println(d);
		}
			
		sc.close();
		
		
		
	}
}
