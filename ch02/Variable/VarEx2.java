package ch02.Variable;

//두 변수의 값 교환하기	
public class VarEx2 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;	//변수 x,y를 선언하고 각각 10, 20으로 초기화	
												//변수 타입이 같은 경우 ,로 연결해 선언할 수 있다
		int tmp = 0;	//변수 tmp를 선언하고 0으로 초기화
									//x,y 두 변수의 값을 교환하기 위해서는 변수를 하나 더 선언해 임시 저장소로 사용
		
		System.out.println("x:" + x + " y:" + y);	//변수 x,y 출력
			
		tmp = x;	//변수 x에 저장된 값을 변수 tmp에 저장
		x = y;		//변수 y에 저장된 값을 변수 x에 저장
		y = tmp;	//변수 tmp에 저장된 값을 변수 y에 저장
		
		System.out.println("x:" + x + " y:" + y);	//변수 x,y 출력
	}
}
