package ch03.Operator;

public class OperatorEx18 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		
		//두 번의 논리연산 후에도 b의 값은 여전히 0 > 우측 피연산자를 평가하지 않았기 때문
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
