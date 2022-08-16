import java.util.Scanner;

//n개의 정수입력받아 저장, 이중 0개 이상의 연속된 정수들을 더하여 얻을수 있는 최대값(음수값있다고 가정)?

public class Code12 {

	public static void main(String[] args) {
		System.out.println("숫자N입력");
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
		}
		// 모든 구간을 전부 검사(구간을 정의해야)
		// int sum = 0; !!error!! 여기에서 정의해서 문제
//		int max = 0;
//		for(int i = 0; i<n; i++) {		//구간의 시작
//			for(int j = i; j<n; j++) {//구간의 끝 (j=i라는 건 길이가 1인구간)
//				int sum = 0; //특정구간 계산 끝난 후 sum을 초기화해야 
//				for(int k = i; k<=j; k++) {
//					sum += array[k];    //특정 '1개구간' 합을 구하고
//				}
//				if(max<sum) max = sum;  // 비교 (더함과 비교를 따로)
//
//			}
//		}

//		//위 방식은 특정구간 정한뒤 더함값을 나아가면서 비교할 때 계산이 중복됨(비효율적) 
//		//ex 1~3구간 비교후 1~4구간 계산시 시 이전 수행했던 1~3구간 더한후 거기에 4를 더함
//		//이전 더함값을 활용할 수 있다면 더 효율적 (더함과 비교를 동시에)
//		int max = 0;
//		for(int i =0; i<n; i++) {
//			int sum = 0; //시작점이 바뀔때 sum을 처음부터 다시새로 쓸거니까 여기서 초기화
//			for(int j=i; j<n; j++) {
//				sum += array[j];  //Mine 무의식적으로 반복문의 최대범위까지 한번에 진행한다고 생각
//				if(sum>max) max = sum;	
//		}
//		}
//		
//	
//		System.out.println(max);

		// Mine2

		int max = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += array[j];
				if (max < sum)
					max = sum;
			}
		}

		// mine1 같은 해결방법을 이중반복문으로 하려시도
//		int max = 0;
//		int sum = 0;
//		for(int i = 0; i<n; i++) {
//			for(int j = i+1; j<n; j++) {
//				sum = array[i] + 
//				
//				if(max<array[]) max = array[];
//			}

	}

}
