package ch03.Operator;

public class OperatorEx06 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//a,b가 모두 int형 보다 작은 byte형이므로 두 피연산자의 자료형을 int형으로 변환 해 연산을 수행
		//a+b 연산 결과는 int형이므로 byte변수에 형변환 없이 저장하면 에러 발생 > byte으로 형변환을 해야함
		
		//byte c = a + b;
		byte c = (byte)(a + b);
		System.out.println(c);

	}

}
