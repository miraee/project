import java.util.InputMismatchException;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0, z = 0;	//x,y,z �� �ʱ�ȭ
		Scanner input = new Scanner(System.in);	//ǥ���Է����� ��ä ����
		
		try {
			x = input.nextInt();	//x�� ������ �Է¹���
			y = input.nextInt();	//y�� ������ �Է¹���
			z = x * y;	//z = x ���ϱ� y
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(InputMismatchException e) {	//������ �ƴ� ���� �Էµ��� �� ����ó��
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
}
