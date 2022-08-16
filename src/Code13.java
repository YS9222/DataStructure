import java.util.Scanner;

//배열6 13:00
//n개의 음이 아닌 한 자리 정수를 입력받아 배열에 저장, 이 중 1개 이상 연속된 정수를 나열하여 얻을 수 있는 소수 중 최대값을 출력
//소수가 없을시 별도 문장 출력 
//ex 13435 끝 3개를 나열하여 4백3십5

public class Code13 {

	public static void main(String[] args) {
		System.out.println("숫자N입력");
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
		}
		// !!IMPORTANT!! 새로운 digit을 읽어나갈때마다 기존 값에서 *10 후 해당 digit 더하기
		//상기 파악후 나머지 mine ver(틀림)
//		int max = 0;
//
//		for (int i = 0; i < n; i++) {
//			for (int j = i; j < n; j++) {
//				int val = 0;
//
//				for (int k = i; k <= j; k++) { //Code12와 같이 이전계산을 활용할수 없으니 3중 //구간정해서 돌리는거 미숙함
//					boolean isPrime = true;
//					val = val * 10 + array[k]; //integer 최대 32비트저장가능(2의 32승)(음수도포함해야하기에 양수는 2의 31승까지가능)
//												//2의 31승은 10의 9승 (약 10억) 정도이기에 해당 방법은 어느정도 한계

//					for (int p = 2; p * p <= val; p++) {
//						if (val % p == 0)
//							isPrime = false;
//							break; //!!error!! 처음에 이거 놓침
//					}
//					if (isPrime && val>1 && max < val) // !!error!! isPrime = false/ val>1 놓침
//						max = val;				//max>1이 아니라 val>1인 이유는?
//												//해당 조건이 소수판별반복문을 1회라도 작동시키기 위함이기때문(없다면 실행이 안되어 1인 상태로 isPrime이 true로 넘어감)
//				}
//			}
//		}
//		if(max>0) System.out.println("Maximum Prime is " + max);
//		else System.out.println("There is no Prime Number");
	
		

		
		
		
//		//mine2 //틀림
//		int maxPrime = 0;
//		for(int i = 0; i<n; i++) {
//			int val = 0; //!!error!!
//			for(int j = i; j<n; j++ ) {
//				boolean isPrime = true;//!!error!!
//				
//				val = val*10 +array[j];//!!error!!
//				for(int k = 2; k*k <=val; k++) {
//					if(val%k == 0) isPrime = false;
//					break;
//				}
//				if(val>1 && val>maxPrime && isPrime) maxPrime = val;
//			}
//		}
//		System.out.println(maxPrime);
//		
		
		// mine
//		//정수나열
//		//소수판별
//		//최대값판별
//		//출력 //구현실패
//		for(int i =0; i<n; i++) {
//			for(int j = 0; j<n; j++) { //int j=i 했어야(그래야 다시 앞쪽으로 안 넘어가지)
//				나열방법 구현못함
//			}
//		}
//
		//Mine3 Code12처럼 2중으로 안될까 생각함
//		int max = 0;
//		for(int i = 0; i<n; i++) {
//			int val = 0;
//			for(int j = i; j<n; j++) {
//				boolean isPrime = true;
//				val = val*10 + array[j];
//				
//				for(int k = 2; k*k<val; k++) {
//					if(val%k==0) isPrime = false;
//					break;
//				}
//				if(isPrime = true && max<val ) max = val;
//				
//			}
//		}
//		if(max>0) System.out.println("Maximum Prime is " + max);
//		else System.out.println("There is no Prime Number");
		//Mine 틀림
		int max = 0;
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int val = 0;
				for(int p = i; p<=j; p++) {
				boolean isPrime = true;
				val = val*10 + array[p];
				
				for(int k = 2; k*k<val; k++) {
					if(val%k==0) isPrime = false;
					break;
				}
				if(isPrime && max<val && val>1 ) max = val;
				
			}
		}
		}
		if(max>0) System.out.println("Maximum Prime is " + max);
		else System.out.println("There is no Prime Number");
		

		
		
	}
}
