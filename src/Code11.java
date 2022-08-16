import java.util.Scanner;

//반복문5 16:18
//숫자 N을 입력받은 후 N개 정수입력받아 그대로 배열저장, 중복된 정수쌍의 개수를 출력
//ex 22244 이면 2는 3쌍, 4는 1쌍(순열)
public class Code11 {

	public static void main(String[] args) {
		System.out.println("숫자N입력");
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		int[] array = new int[n];
		for(int i = 0; i<n; i++) {
			array[i] = kb.nextInt();
		}

		
		
//		int cnt = 0;
//		
//		for(int i = 0; i<n; i++) {
//			for(int j = i+1; j<n; j++) { //i<j로 충분할때 !!error!! int j = 1로 했음
//				if(array[i] == array[j]) cnt++;
//			}
//		}
//			
//		System.out.println(cnt);
		
}
}


// 모든 쌍 검사 방법 