package ch04ControlStatement;

public class FlowEx10 {

	public static void main(String[] args) {
		int sum = 0;
		
		//변수 i를 1부터 10까지 변화시키녀서 i를 sum에 계속 더해 누적시킴
		for (int i = 1; i <= 10; i++) {
			sum += i; 
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
		}

	}

}
