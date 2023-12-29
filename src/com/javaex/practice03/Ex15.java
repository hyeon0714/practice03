package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {
	
	/*
	아래와 설명에 맞는 프로그램을 작성하세요
	숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요
	예를들어 10을 입력한 경우 1, 2, 5, 10 이 출력된다.
	*/
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요:");
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int b=1; b<=a; b++) {
			if(a%b==0) {
				System.out.println(b);
			}else {
				
			}
			
		}
		
		
		
		sc.close();
	}
}
