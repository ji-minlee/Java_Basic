package ch03.Operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;	//- 부호 연산자는 부호를 반대로 변경
		System.out.println(i);
	}

}
