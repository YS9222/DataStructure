import java.util.Scanner;

//반복문4 16:36
//n개 정수 입력받고 배열에 저장, 정수들을 한칸씩 오른쪽으로 이동 맨 마지막 값은 맨 앞으로 이동
public class Code09 {

	public static void main(String[] args) {
		
		//mine (correct)
		System.out.println("배열크기입력");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] array = new int[n];
		
		System.out.println("정수입력");
		for(int i = 0; i<array.length; i++) {
			array[i] = kb.nextInt();
		}
//
//		int temp = array[n-1];
//		
//		for(int i = n-2; i>=0; i--) { //처음에 i>0해서 잘못나옴
//			
//			array[i+1] = array[i];
//		}
//		
//		array[0] = temp;
//		
//		for(int i = 0; i<n; i++) {
//			System.out.println(array[i]);
//		}
		
	
	}

	
	
	
}
