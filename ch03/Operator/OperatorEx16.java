package ch03.Operator;

public class OperatorEx16 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		
		//내용은 같지만 서로 다른 객체이므로 false
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		
		//equals()는 객체가 달라도 내용이 같으면 true 반환
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		
		//대소문자를 구별하지 않고 비교하고 싶다면 equalsIgnoreCase()
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

		
	}

}
