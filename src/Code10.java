
//1~100,000 사이의 모든 소수를 찾아서 출력
public class Code10 {
	
	public static void main(String[] args) {
		
		//소수판별방법 (1, 자기자신을 제외한 수로 나누어서 떨어지면(약수를 가지면) 소수가 아님)
		//n의약수가(n을 나눌수 있는 수) n/2보다 클 수는 없기에 n/2까지만 검사 (덧셈세계에서의 중간)
		//사실 n/2까지 갈 것도 없이 루트n (sqrt(n))까지만도 가능 
		//왜냐하면 약수는 쌍으로 이루어지는데 약수의 쌍 모두 루트n을 넘으면 그건 원래숫자가 아니기 때문 (곱하기세계에서의 중간)
	
		
//		int n =5;
//		
//		//소수검증, 출력
//		boolean isPrime = true;
//				//i가 루트n보다 작다는것은 i제곱이 n보다 작다느 것	
//		for(int i = 2; i*i<=n && isPrime; i++) {
//			if(n%i==0) {		//for문 지속조건 안에 &&로 boolean 타입 넣으면 break역할가능
//				isPrime = false;
//				//break;		//자신을 둘러싼 while, for, switch문을 탈출
//			}
//		}
//		
//		if(isPrime) {
//			System.out.println(n);
//		}

		//Mine
		//boolean isPrime = true;
//		for(int n = 2; n<=100000; n++) {
//			
//			boolean isPrime = true;
//			
//			for(int i=2; i*i<=n; i++) {
//				if(n % i == 0) {
//					isPrime = false;
//					break;
//				}
//				if(isPrime) {
//					System.out.println(i);  //해당 출력문을 검증for문에 안에 잘못 넣어버림
//				}
//			}
//			//isPrime = true; //처음 여기에 잘못둠
//		}
		
		//정답
//		for(int n = 2; n<=100000; n++) {
//			boolean isPrime = true; //여기에 두면 반복문이 순환할때마다 boolean이 초기화//실패1
//			for(int i =2; i*i<=n; i++) {
//				if(n % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {				//실패1
//				System.out.println(n);
//			}
//			
//		}
//		
		
	}

}
 