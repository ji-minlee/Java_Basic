package ch03.Operator;

public class OperatorEx12 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;	//소수점 셋째자리까지 버림
		// (int) (3141.592f) / 1000f
		// 3141 / 1000f
		// 3141.0f / 1000f -> 3.141f
		System.out.println(shortPi);

	}

}
