package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx04 {

	public static void main(String[] args) {
		int score = 0;	//점수를 저장하기 위한 변수
		char grade = ' ';	//학점을 저장하기 위한 변수, 공백으로 초기화
		
		System.out.println("점수를 입력하세요 > ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();	//화면을 통해 입력받은 숫자를 score에 저장
		
		if (score >= 90) {	//score가 90점 보다 같거나 크면 A
			grade = 'A';	
		} else if (score >= 80) {	// score가 80점 보다 같거나 크면 B
			grade = 'B';
		} else if (score >= 70) {	//score가 70점 보다 같거나 크면 C
			grade = 'C';
		} else {	//나머지는 D
			grade = 'D';
		}
		System.out.println("학점은 " + grade + "입니다.");

	}

}
