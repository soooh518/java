package day2;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 1과 자기자신인수 
		 * 2, 3, 5, 7, 11, 13, 17 ..
		 * 방법 1
		 * 1. 정수를 저장할변수 num와 약수의 갯수를 저장할 변수 cnt와 반복문 변수 i를 선언 및 초기화
		 * 2.i 1부터 num까지 하나씩 증가하며 반복
		 * 3.i가 num의 약수이면 약수의 갯수 1개 증가
		 * 3.num를 i로 나누었을때 나머지가 0이면 cnt를 1증가
		 * 4.반복문이 종료된 후 cnt가 2개이면 소수 아니면 합성수로 출력
		 * */
		//방법1
		int i=0;
		int num=18;
		int cnt =0;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
			if(cnt==2) {
			System.out.println(num + "은 소수입니다.");
			}else{
			System.out.println(num + "은 합성수입니다.");
			}
			/*방법2
			 * 1. 정수를 저장할 변수 num와 약수의 갯수를 저장할 변수 cnt와 반복문 변수 i를 선언 및 초기화
			 * 2. i는 num-1부터1까지 하나씩 감소하면서 반복
			 * 3.num를 i로 나누었을때 나머지가 0이면 반복문 종료
			 * 4. i가 1이면 소수, 아니면 합성수*/			
			cnt = 0;
			for(i = num-1; i>=1; i--) {
				if(num %1 ==0) {
					//이때 i가 num을 제외한 가장 큰 약수이다.
					break;
				}
			}
			//i가 1이면 num를 제외한 약수가 1이라는 의미이고,
			//이는 약수가 2개라는 의미이므로 소수이다.
			if(i ==1) {
				System.out.println(num + " 는 소수입니다.");

			}else{
			System.out.println(num + "은 합성수입니다.");
			}
			}

			
			}
	

