package day2;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ּ� ����� : �� ���� ������� �ּ��� �����
		 * ����� : �� ���� ��� �� �������� ���
		 * ��� : �� ���� ����� �������� 0�� ��
		 * 10 :10, 20, 30, 40, 50, ...
		 * 15 :15, 30, 45, 60, 75, ...
		 * 10�� 15�� ����� : 30, 60, 90, ...
		 * 10�� 15�� �ּҰ���� : 30
		 * 1. �� ������ ������ ���� num1�� num2, �ݺ����� ����� ���� i�� �����Ѵ�.
		 * 2. i�� num1���� num1*num2���� i�� �ϳ��� �����ϸ鼭 �ݺ��Ѵ�.
		 * 3. i�� num1���� ���������� �������� 0�̰�(���), 
		 * i�� num2���� ���������� �������� 0�̸�(���) i�� ���(�����)�ϰ� �ݺ����� �����Ѵ�.(�ּҰ����)
		 * �ݺ����� �����ϱ����ؼ��� switch case������ ����� break�� �̿��Ѵ�.
		 * a�� b�� ��� = b�� a�� ���
		 * =a�� b�� ���������� �������� 0
		 * (�����)*/
		int i=0;
		int num1=10;
		int num2=15;
		int cnt = 0;

		//�ܼ�
		for(i=num1;i<=num1*num2;i++) {
			cnt++;
			if(i%num1==0 && i%num2==0) {
			System.out.print(i + " ");
			break;
	}
		}
		System.out.println("�ܼ��ݺ�Ƚ�� :"+cnt);
		cnt=0;
		//���� ����
		for(i=num1;i<=num1*num2;i+=num1) {
			cnt++;
			if (i%num2==0) {
			System.out.print(i + " ");
			break;
		}
		}
		System.out.println("���ݹݺ�Ƚ�� :"+cnt);
		cnt=0;
		//���� ����
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
		System.out.println("���̹ݺ�Ƚ�� :"+cnt);
		cnt=0;
}}