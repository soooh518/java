package day2;

public class ForEx2 {
	public static void main(String[] args) {
		/* 1부터 10사이에 홀수만 출력하는 코드를 for문을이용하여 작성하세요.
		 * 1.반복문에 사용할 변수 i를 선언.
		 * 2.반복문은 i가 1부터 10까지 반복하며 i는 하나씩 증가한다.
		 * 3. i를 2로 나누었을때 나머지가 1과 같다면 i를 출력.
		 */
		int i =0;
		for(i=1;i<11;i++) {//조건문사용
			if (i%2==1) {
				System.out.println(i);
			}
		}
		for(i=1;i<=10;i+=2) {//조건문미사용
			System.out.println(i);
		}
		/*1~10까지의 합을 구하는 예제를 작성하세요
		 * 1.반복문에서 사용할 변수 i와 합계를 저장할 변수 sum을 선언한다.
		 * 2. 반복문은 1부터 10까지 i가 하나씩 증가하며 반복한다.
		 * 3.sum에다 i를 더해서 다시 sum에 저장한다.
		 * 4.반복문이 종료되면 합계를 출력
		 *  */
		int sum=0;
		for(i=1;i<=10;i++)
			sum = sum +i;
			System.out.println("1부터10까지의 합 :" + sum);
			/*구구단 7단을 출력하는 코드를 작성하세요
			 * 7 x 1 = 7
			 * 7 x 2 = 14
			 * 7 x 3 = 21
			 * ...
			 * 7 x 9 = 63*/
		int j=7;

			for(i=1; i<10;i++)
			
			System.out.println(j + "x"+ i + "=" + j*i );
		
}
}
