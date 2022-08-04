package ch03.Operator;

public class OperatorEx02 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++;	//후위형은 참조해 대입 후에 증가
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;	// 전위형은 증가 후에 참조해 대입
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);

	}

}
