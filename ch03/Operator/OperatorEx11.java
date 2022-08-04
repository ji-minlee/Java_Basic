package ch03.Operator;

public class OperatorEx11 {

	public static void main(String[] args) {
		
		System.out.printf("10 == 10.0f %b%n", 10==10.0f);
		
		System.out.printf("0.1 == 0.1f %b%n", 0.1==0.1f);
		//실수형은 근사값으로 저장되므로 오차가 발생할 수 있다 
		//float타입과 double타입을 비교하려면 double타입을 float타입으로 형변환 후 비교해야 한다
		
	}

}
