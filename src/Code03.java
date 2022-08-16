import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null; //초기화(어떤데이터도 x)
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type a String : ");
		
		input = kb.next();
		
		//if(str==input){ ==로는 문자열간 비교 불가(프리미티브 타입만 비교가능 (byte short int long double char boolean...))
		if(str.equals(input)) { //.matches도 됨 둘의 차이는?
			System.out.println("match");
		}
		else {
			System.out.println("donot match");
		}
	}

}
