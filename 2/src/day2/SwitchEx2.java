package day2;

public class SwitchEx2 {

	public static void main(String[] args) {
		/* ���� ch�� a �Ǵ� A�̸� A�Դϴٶ�� �ֿܼ� ����ϰ�
		 * ���� ch�� b �Ǵ� B�̸� B�Դϴٶ�� �ֿܼ� ����ϰ�
		 * ���� ch�� a,b,A,B�� �ƴϸ� A�� B�� �ƴմϴٶ��
		 * �ֿܼ� ����ϴ� ������ swith case������ �ۼ��ϼ���.
		 */
		char ch = 'E';
		switch(ch) {
		case 'a'://ch�� ���� a�̸�
		case 'A':
			System.out.println("A�Դϴ�");
			break;
		case 'b':
		case 'B':
			System.out.println("B�Դϴ�");
			break;
		default:
			System.out.println("A�� B�� �ƴմϴ�.");
		}
	}
}
