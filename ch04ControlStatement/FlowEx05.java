package ch04ControlStatement;

import java.util.Scanner;

public class FlowEx05 {

	public static void main(String[] args) {
		int score = 0; 
		char grade = ' ', opt = '0';

		System.out.println("점수를 입력해 주세요 > ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
		if (score >= 90) {	//score가 90점 이상이면 A
			grade = 'A';
			if (score >= 98) {	//90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if (score < 94) {	//90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {	//나머지는 C
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
	}

}
