package ch03.Operator;

public class OperatorEx05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);	//나누기 연산자의 두 피연산자가 모두 int인 경우, 연산결과도 int타입
		System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);

	}

}
