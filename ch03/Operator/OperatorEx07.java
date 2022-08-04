package ch03.Operator;

public class OperatorEx07 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;	//int타입과 int타입의 연산 결과는 int타입이므로 long으로 자동변환되어도 값은 변하지 않음
		
		System.out.println(c);	//-1454759936 출력
		
		c = (long) a * b;	//올바른 결과를 얻으려면 변수 a 또는 b의 타입을 long으로 형변환
		
		
		
		
		long d = 1_000_000 * 1_000_000;
		long e = 1_000_000 * 1_000_000L;
		
		System.out.println("d = " + d);		//int와 int의 연산은 int > 연산결과 int타입의 최대 값을 넘어 오버플로우가 발생
		System.out.println("e = " + e);		//int와 long의 연산은 연산결과 long
		

	}

}
