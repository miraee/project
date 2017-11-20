class InvalidWithdraw extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}	//������: msg = ������ �޽��� �̸�
}	//���ο� ���� InvalidWithdraw ���� - ��üũ����
public class BankAccount {
	private int minmoney;	//���� �ܱ�
	private int repository;	//�ܱ�
	public BankAccount() {
		minmoney = 0;
	}	//�����ܱ��� 0���� �ʱ�ȭ�ϴ� ������
	public BankAccount(int min) {
		minmoney = min;
	}	//�����ܱ��� ������ �� �ִ� �ʵ带 �����ϴ� ������
	public void deposit(int money) {
		repository += money;
		System.out.println("���� �Ա�ó��: �Աݱݾ�=" + money + ", �ܱ�=" + repository);
	}	//�Ա� �޼ҵ�
	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)	//���� ��û �ݾ��� �����̸� ���ܹ߻�
			throw new InvalidWithdraw("���� �ݾ��Դϴ�.");
		else if (repository - money < minmoney)	//���� ��û �ݾ��� ���� �ܱ� ���ϸ� ���ܹ߻�
			throw new InvalidWithdraw("�ʰ���� �䱸 ����.");
		else {	//�������� ��쿡��
			repository -= money;	//�ܱ��� ��û �ݾ׸�ŭ �پ��
			System.out.println("���� ���ó��: ����ݾ�=" + money + ", �ܱ�=" + repository);
			return minmoney;	//���� �ܱ��� ����
		}
	}	//��� �޼ҵ�
}
