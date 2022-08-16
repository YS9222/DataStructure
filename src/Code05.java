import java.util.Scanner;

//배열

public class Code05 {

	public static void main(String[] args) {
		int[] grade = new int[5];
		double[] abc = new double[5];
		
		int n = 123;
		String[] abcde = new String[n];
		
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		char[] abcd = new char[m];  //variable length를 가변

		
		grade[0] = 100;
		grade[1] = 52;
		grade[2] = 23;
		grade[3] = 58;
		grade[4] = 13;
		
//		System.out.println(grade[0]);
//		System.out.println(grade[1]);
//		System.out.println(grade[2]);
//		System.out.println(grade[3]);
//		System.out.println(grade[4]);
				   //조건(충족시 아래실행) //실행후 실행
		for(int i = 0; i<grade.length; i++) { //array의 크기 기억할 필요 없음
			System.out.println("grade number " + (i+1) + " is " + grade[i]);
		}
		
		int i = 0;
		while(i<grade.length) {
			System.out.println("grade number " + (i+1) + " is " + grade[i]);
			i++;
		}
		
		
	}

}
