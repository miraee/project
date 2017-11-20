import java.util.Date;
public class PrintTime implements Runnable {
//Ŭ���� PrintTime�� �������̽� Runnable�� �����ϴ� Ŭ����
	private int count;	//count�ʵ����
	public PrintTime(int count) {
		this.count = count;
	}	//count�� �����ϴ� ������

	public void run() {
		Date current = new Date();	//Date��ü����
		while (count != 0) {	//count�� 0�� �ƴҶ����� �ݺ�
			System.out.println("����: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {	
				Thread.sleep(1000);
				current = new Date();	//Date��ü����
			} catch (InterruptedException e) {}	//����ó��
		}
	}
}
