package ch04ControlStatement;

public class FlowEx20 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if(i%3 == 0) {	//조건식이 참이 되어 continue문이 수행되면
				continue;
			}
			System.out.println(i);
		}	//블럭의 끝으로 이동 > 반복문을 벗어나지 않음

	}

}
