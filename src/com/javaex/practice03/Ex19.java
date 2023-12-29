package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {
	
	/*
	아래와 같이 은행 프로그램을 작성하세요
	“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
	“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
	“3.잔고” 선택시 현재 잔고가 출력됩니다.
	“4.종료” 선택시 종료됩니다.
	“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
	*/
	public static void main(String[] args) {
		/*
        boolean run = true;
       
        int balance = 0;
       
        Scanner scanner = new Scanner(System.in);
       
        while(run) {
               System.out.println("----------------------------");
               System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
               System.out.println("----------------------------");
               System.out.print("선택> ");
              
               int num = scanner.nextInt();
              
               switch(num) {
               case 1:
                       System.out.print("예금액> ");
                       balance += scanner.nextInt();
                       break;
               case 2:
                       System.out.print("출금액> ");
                       balance -= scanner.nextInt();
                       break;
               case 3:
                       System.out.println(String.format("잔고> %d",balance));
                       break;
               case 4:
                       run = false;
                       break;
                       default:
                              System.out.println("알수없는 입력입니다.");
               }
               
               
        }
       
        System.out.println("프로그램 종료");
        */

		boolean run=true;
		Scanner sc=new Scanner(System.in);
		
		int b=0;
		int c=0;
		

		while(run) {
			
			System.out.println("-------------------------------");
			System.out.println("1.예금 :2.출금 :3.잔고 :4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			

			
			int a=sc.nextInt();
			if(a==1) {
				System.out.print("예금액>");
				b=sc.nextInt();
				c=c+b;
			}else if(a==2) {
				System.out.print("출금액>");
				b=sc.nextInt();
				c=c-b;
			}else if(a==3) {
				System.out.print("잔고"+c);
			}else if(a>4) {
				System.out.println("다시입력해주세요");
			}else {
				System.out.println("종료");
				run=false;
			}
			
						
		}sc.close();
		
		
	}
	
}
