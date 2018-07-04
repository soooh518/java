package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* switch(변수){
		case 값1://if(변수 == 값1)
			실행문1;
			//break가 있으면 변수값이 값1일때 실행문1만 실행,
			//없으면 변수값이 값1일때 실행문 1과 실행문2가 같이 실행됨 
			break;
		case 값2://else if(변수 == 값2)
			실행문2;
			break;
		default: //else
			실행문3;
	}*/
		/* num의 값이 0이면 콘솔에0입니다라고 출력하고
		 * num의 값이 1이면 콘솔에 1입니다라고 출력하고
		 * num의 값이 0과 1이 아니면 콘솔에 0과 1이 아닙니다
		 * 라고 출력하는 예제
		 */
		int num = 4;
		switch(num){
		case 0:// if (num==0)
			System.out.println("0입니다.");
			break;
		case 1://else if (num==1)
			System.out.println("1입니다.");
			break;
		default: //else
			System.out.println(num+"는 0과 1이 아닙니다.");
		}
	}
}
