package ch02.Variable;

public class StringEx {

	public static void main(String[] args) {
		String name = "Ja" + "va";	//변수 name에 문자열 리터럴 "Ja" + "va"를 저장 > Java
		String str = name + 8.0;	//변수 str에 name + 8.0을 저장
		
		System.out.println(name);	//변수 name 출력
		System.out.println(str);	//변수 str 출력
		System.out.println(7 + " ");	
		System.out.println(" " + 7);	//빈칸 + 7 
		System.out.println(7 + "");	
		System.out.println("" + 7);
		System.out.println("" + "");	
		System.out.println(7 + 7 + "");		//14 + "" > "14" + "" > "14"
		System.out.println("" + 7 + 7);		//"7" + 7 > "7" + "7" > "77"
	}

}
