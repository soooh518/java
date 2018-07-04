package day2;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*두 수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수 : 두 수의 공배수는 최소인 공배수
		 * 공배수 : 두 수의 배수 중 공통적인 배수
		 * 배수 : 그 수를 나누어서 나머지가 0인 수
		 * 10 :10, 20, 30, 40, 50, ...
		 * 15 :15, 30, 45, 60, 75, ...
		 * 10과 15의 공배수 : 30, 60, 90, ...
		 * 10과 15의 최소공배수 : 30
		 * 1. 두 정수를 저장할 변수 num1과 num2, 반복문에 사용할 변수 i를 선언한다.
		 * 2. i는 num1부터 num1*num2까지 i가 하나씩 증가하면서 반복한다.
		 * 3. i가 num1으로 나누었을때 나머지가 0이고(배수), 
		 * i가 num2으로 나누었을때 나머지가 0이면(배수) i를 출력(공배수)하고 반복문을 종료한다.(최소공배수)
		 * 반복문을 종료하기위해서는 switch case문에서 사용한 break를 이용한다.
		 * a가 b의 배수 = b는 a의 약수
		 * =a를 b로 나누었을때 나머지가 0
		 * (공배수)*/
		int i=0;
		int num1=10;
		int num2=15;
		int cnt = 0;

		//단순
		for(i=num1;i<=num1*num2;i++) {
			cnt++;
			if(i%num1==0 && i%num2==0) {
			System.out.print(i + " ");
			break;
	}
		}
		System.out.println("단순반복횟수 :"+cnt);
		cnt=0;
		//조금 생각
		for(i=num1;i<=num1*num2;i+=num1) {
			cnt++;
			if (i%num2==0) {
			System.out.print(i + " ");
			break;
		}
		}
		System.out.println("조금반복횟수 :"+cnt);
		cnt=0;
		//많이 생각
		int tmpNum = num1;
		int div =num2;
		if(num2>num1) {
			tmpNum = num2;
			div =  num1;
		}
		for(i=tmpNum;i<=num1*num2;i+=tmpNum) {
			cnt++;
			if (i%div==0) {
			System.out.print(i + " ");
			break;
		}
		}
		System.out.println("많이반복횟수 :"+cnt);
		cnt=0;
}}