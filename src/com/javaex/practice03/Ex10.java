package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {
	
	//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자:");
		int a=sc.nextInt();
		System.out.print("숫자:");
		int b=sc.nextInt();
		System.out.print("숫자:");
		int c=sc.nextInt();
		System.out.print("숫자:");
		int d=sc.nextInt();
		System.out.print("숫자:");
		int e=sc.nextInt();
		
		if(a>=b && a>=c && a>=d && a>=e) {
			System.out.println("최대값은 "+a+"입니다");
		}else if(b>=a && b>=c && b>=d && b>=e) {
			System.out.println("최대값은 "+b+"입니다");
		}else if(c>=a && c>=b && c>=d && c>=e) {
			System.out.println("최대값은 "+c+"입니다");
		}else if(d>=a && d>=b && d>=c && d>=e) {
			System.out.println("최대값은 "+d+"입니다");
		}else {
			System.out.println("최대값은 "+e+"입니다");
		}
		sc.close();
	}

}
