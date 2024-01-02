package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	
	//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b=0;
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<5;i++) {
			System.out.print("숫자:");
			int a=sc.nextInt();
			if(b<a) {
				b=a;
			}
		}System.out.println("가장 큰수는 "+b+"입니다");
		sc.close();
	}

}
