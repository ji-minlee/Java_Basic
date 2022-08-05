package ch04ControlStatement;

public class FlowEx11 {

	public static void main(String[] args) {
		
		//하나의 for문에 두 개의 변수 사용
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.printf("%d \t %d%n", i, j);
		}
		
		//하나의 변수만으로 같은 결과 얻기
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d \t %d%n", i, 11-i);
		}

	}

}
