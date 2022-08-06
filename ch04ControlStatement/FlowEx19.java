package ch04ControlStatement;

public class FlowEx19 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if ( sum > 100) {	//sum값이 100을 넘으면 break문이 실 수행되 반복문을 봇어남
				break;
			}
			++i;
			sum += i;
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);

	}

}
