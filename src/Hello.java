
public class Hello {
	
	static int num;
	public static void main(String[] args) {
	
		System.out.println("Hello!");
		int anotherNm = 5;
		num = 2;
		
		System.out.println(num + anotherNm);
		System.out.println("Num : " + num);
		System.out.println("AnotherNum" + anotherNm);
		System.out.println("Sum" + num + anotherNm); // 문자열 이후 +는 뒤를 문자열로 인식하게함 
		System.out.println("Sum" + (num + anotherNm)); // but, ()통해 연산시작순서를 바꿔 인식을 다르게할수 
		System.out.println(num + anotherNm + "Sum"); // 문자열 이후가 아니기에 앞의 +는 숫자로 작동함
	}
}
