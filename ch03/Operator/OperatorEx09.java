package ch03.Operator;

public class OperatorEx09 {

	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d-a);
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c' = %d%n", a, (int)a);
		System.out.printf("'%c' = %d%n", d, (int)d);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		System.out.printf("'%c' = %d%n", two, (int)two);
		

		
		char c1 = 'a';	//'a'의 코드값인 97이 저장
		char c2 = c1; 	//c1이 저장되어 있는 값이 c2에 저장
		char c3= ' ';	//c3를 공백으로 초기화
		
		int i = c1 + 1;		//'a'+1 > 97+1 > 98
		
		c3 = (char)(c1 + 1);	//98 >char로 형병환 : b
								//c1+1의 연산결과가 int이므로 char타입에 담기 위해 char로 형변환
		c2++;
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		
		
		
		char b1 = 'a';
//		char b2 = c1 + 1;		//컴파일 에러 발생
		char b2 = 'a' + 1;		//리터럴 간의 연산이므로 컴파일 에러가 발생하지 않음
		
		System.out.println(b2);
	}

}
