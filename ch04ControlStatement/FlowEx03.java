package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx03 {

	public static void main(String[] args) {
		System.out.println("숫자 하나를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		} else {	//input이 0이 아닌 경우
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
	}

}
