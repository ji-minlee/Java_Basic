package ch02.Variable;

public class CastingEx3 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;
		
		System.out.printf("f = %20.18f\n", f);	//정수부분은 20개, 소수점부분 18개
		System.out.printf("d = %20.18f\n", d);	
		System.out.printf("d2 = %20.18f\n", d2);	//정밀도 때문에 서로 다른 값이 저장	
		
		
	}

}
