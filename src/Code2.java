import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		int Number = 123;
		
		Scanner abc = new Scanner(System.in);
		
		System.out.println("please enter type integer");
		int ab = abc.nextInt();
		
		if(ab == Number) {
			System.out.println("Correct");
		}else {
			System.out.println("Wrong");
		}
		
		abc.close();
	}

}
