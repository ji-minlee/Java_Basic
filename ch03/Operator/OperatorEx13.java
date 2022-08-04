package ch03.Operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int) (pi * 1000 +0.5) / 1000.0;
		//반올림을 위해 0.5를 더해줌
		//소수점 넷째자리에서 반올림
		System.out.println(shortPi);
		
		
		
		
		//Math.round를 활용한 반올림
		double pi2 = 3.141592;
		double shortPi2 = Math.round(pi2 * 1000) / 1000.0;
		
		System.out.println(shortPi2);


	}

}
