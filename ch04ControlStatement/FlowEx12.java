package ch04ControlStatement;

public class FlowEx12 {

	public static void main(String[] args) {
		//총 다섯줄
		for (int i = 1; i <= 5; i++) {
			//한번에 10개씩
			for(int j = 1; j <=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
