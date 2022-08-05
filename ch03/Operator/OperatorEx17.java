package ch03.Operator;

public class OperatorEx17 {

	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		
		x = 15;
		
		//x가 10보다 크고 20보다 작다
		System.out.printf("x=%2d, 10 < x && x < 20 =%b%n", x, 10 < x && x <20);

		x = 6;		
		//x가 2 또는 3의 배수이지만 6의 배수는 아니다 > 괄호가 필요하므로 false
		//&&가 ||보다 우선순위가 높기 때문
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6 != 0 =%b%n", x, x%2==0 || x%3==0 && x%6 != 0);
	
		//x가 2 또는 3의 배수이지만 6의 배수는 아니다
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6 != 0 =%b%n", x, (x%2==0 || x%3==0) && x%6 != 0);
		
		ch = '1';		
		//문자 ch는 숫자('0' ~ '9')이다
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <= '9');
		
		ch = 'a';
		//문자 ch는 소문자다
		System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');

		ch = 'A';
		//문자 ch는 대문자다
		System.out.printf("ch = '%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');
	}

}
