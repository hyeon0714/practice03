package com.javaex.practice03;

import java.util.Scanner;

public class ttex10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
		int count = sc.nextInt(); // 입력 받고자 하는 수의 갯수를 입력 받아 변수에 저장
		
		int[] num = new int[count]; // 입력 받은 정수를 저장할 배열 생성
		
		for(int i=0; i<num.length; i++) { // num 배열의 길이만큼 반복
			System.out.print("num[" + i + "] = ");
			num[i] = sc.nextInt(); // 입력 받은 정수를 배열에 저장
		}
		sc.close(); // 스캐너 닫기
		
		// 최댓값 구하기
		int max = num[0]; // 첫 번째 배열의 값을 변수에 대입
		for(int i=1; i<num.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
			if(max < num[i]) max = num[i]; // 각 배열의 값을 차례대로 max의 값과 비교하여 더 큰 값을 max에 대입
		}
		System.out.println("최댓값 : " + max);
		
		// 최솟값 구하기
		int min = num[0]; // 첫 번째 배열의 값을 변수에 대입
		for(int i=1; i<num.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
			if(min > num[i]) min = num[i]; // 각 배열의 값을 차례대로 min의 값과 비교하여 더 작은 값을 min에 대입
		}
		System.out.println("최솟값 : " + min);
	}

}
