package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력) > ");
		
		while(flag) {
			System.out.print(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num != 0) {
				sum += num;
			} else {	//num이 0이면, flag의 값을 false로 변경 > 반복문 탈출
				flag = false;
			}
		}
		
		System.out.println("합계: " + sum);

	}

}
