package ch03.Operator;

public class OperatorEx08 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);		//먼저 곱하는 경우, int의 범위를 넘어서 오버 플로우 발생
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);		//먼저 나누는 경우, 정상적인 연산

	}

}
