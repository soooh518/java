package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		/* 문자 ch가 a 또는 A이면 A입니다라고 콘솔에 출력하고
		 * 문자 ch가 b 또는 B이면 B입니다라고 콘솔에 출력하고
		 * 문자 ch가 a,b,A,B가 아니면 A와 B가 아닙니다라고
		 * 콘솔에 출력하는 예제를 swith case문으로 작성하세요.
		 */
		char ch = 'E';
		switch(ch) {
		case 'a'://ch의 값이 a이면
		case 'A':
			System.out.println("A입니다");
			break;
		case 'b':
		case 'B':
			System.out.println("B입니다");
			break;
		default:
			System.out.println("A와 B가 아닙니다.");
		}
	}
}
