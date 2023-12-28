package com.javaex.practice03;

public class Ex08 {
	
	//아래와 같이 구구단을 출력하세요
	
	public static void main(String[] args) {
		
		for(int a=1; a<=9; a++) { ///세로
			
			for(int b=2; b<=9; b++) {//// 가로
				System.out.print(b+"*"+a+"="+a*b+"\t");///  "\t"으로 칸띄우기
			}
			
			System.out.println();
		}
	}

}
