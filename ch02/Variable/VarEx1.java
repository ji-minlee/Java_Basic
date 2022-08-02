package ch02.Variable;
//변수 선언 및 초기화
public class VarEx1 {

	public static void main(String[] args) {
		
		int year = 0;	//변수 year를 선언하고 0으로 초기화
		int age = 14;	//변수 age를 선언하고 14로 초기화
		
		System.out.println(year);	//변수 year의 값을 출력
		System.out.println(age);	//변수 age의 값을 출력
		
		year = age + 2000;	//변수 age에 저장된 값에 2000을 더한 후 그 결과를 변수 year에 저장
		age = age + 1;	//변수 age에 저장된 값에 1을 더한 후 그 결과를 변수 age에 저장
		
		System.out.println(year);	//변수 year의 값을 출력
		System.out.println(age);	//변수 age의 값을 출력
	}

}
