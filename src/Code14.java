import java.util.Scanner;
//버블정렬
//n개정수 입력받은 후 오름차순으로 정렬 (작은것부터) (버블정렬방식으로)
//처음수부터 자기 바로 옆자리와 비교하여 클 경우 서로 자리바꿈 또 옆과 비교하여 클 시 자리바꿈...
//최대값이 정해지면 비교의 전체 대상은 1씩 줄어듬
public class Code14 {

	public static void main(String[] args) {
		System.out.println("배열자리N입력");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = kb.nextInt();
		}

		for (int i = n - 1; i > 0; i--) { // !!error!! i>=0 i=0이게되면 혼자라서 비교할 필요없기에 이 범위는 필요없음
			//서로자리바꾸는방식 생각못함(단순하네..)
			for(int j = 0; j<i; j++) { //!!error!! j<=i j=i라서 j=n-1까지 간다면 n-1과 n을 비교해야 하기에 비교가 불가해짐
				if(array[j]>array[j+1]) {
					int temp = array[j]; //temp로 가야할게 j이든 j+1이든 상관없음
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int k =0; k<n; k++) {
			System.out.println(array[k]);
		}
		
		
	}
}