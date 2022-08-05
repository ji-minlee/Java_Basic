package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx02 {

	public static void main(String[] args) {
		int input;
		
		System.out.println("숫자 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();	//화면을 통해 입력 받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);	//입력받은 문자열 tmp를 숫자로 변환
		
		if(input == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		//if문에 {}를 사용하지 않았으므로 한 문장만 if문에 속하게 됨 
		if(input != 0) 
			System.out.println("입력한 숫자는 0이 아닙니다. ");
		
		//마지막 문장은 항상 출력됨
			System.out.printf("입력한 숫자는 %d입니다.", input);
		
		

	}

}
