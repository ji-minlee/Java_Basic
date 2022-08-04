package ch03.Operator;

public class OperatorEx11 {

	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char) (lowerCase - 32);	//소문자를 대문자로 변경하려면 A가 a보다 코드값이 32가 적으므로 a의 코드값에서 32를 빼면 됨
		System.out.println(upperCase);

	}

}
