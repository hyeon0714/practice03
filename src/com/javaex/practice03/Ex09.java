package com.javaex.practice03;

public class Ex09 {
	
	//다음과 같이 출력하세요
	
	public static void main(String[] args) {
		
		int b;
		for(int a = 1; a<=10; a++) { // 세로 첫줄만 구현
			
			for(b=1; b<=9+1; b++) {  
				System.out.print(b+a-1+"\t");
			}
			System.out.println();
		}
	}

}
