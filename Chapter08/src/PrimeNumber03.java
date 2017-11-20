import java.util.LinkedList;
public class PrimeNumber03 implements Runnable {
// Ŭ����PrimeNumber03�� �������̽� Runnable�� �����ϴ� Ŭ����
	private int number;	//number �ʵ屸��
	private String name;	//name �ʵ屸��
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) {
		this.number = number;
		this.name = name;
	}	//number�� �̸��� �����ϴ� ������
	
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {	//����for������
			for(j = 2; j < i; j++) {
				if(i % j == 0)	//i�� j�� ����̸�
					break;	//���߰� ����
			}
			if(j == i)	//j�� i�� ������
				prime.add((Integer)j);	//������ j�� �߰�
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
