package ch03.Operator;

public class OperatorEx15 {

	public static void main(String[] args) {
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double) f;
		
		System.out.printf("10 == 10.0f %b%n", 10==10.0f);
		
		System.out.printf("0.1 == 0.1f %b%n", 0.1==0.1f);
		//실수형은 근사값으로 저장되므로 오차가 발생할 수 있다 
		//float타입과 double타입을 비교하려면 double타입을 float타입으로 형변환 후 비교해야 한다
		
		System.out.printf("f = %19.17f%n", f);
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		
		
		System.out.printf("d==f   %b%n", d==f);
		System.out.printf("d==d2   %b%n", d==d2);
		System.out.printf("d2==f   %b%n", d2==f);
		
		//float타입과 double타입을 비교하려면 double타입 값을 float타입으로 변경 후 비교
		System.out.printf("(float)d==f   %b%n", (float)d==f);
		
		
		
	}

}
