public class Ex03 {

	public static void main(String[] args) throws InvalidWithdraw {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(-100000);	//�����ܱ��� -100000�� �����ϴ� BankAccount��ü ����
		ba.deposit(100000);	//100000�� �Ա�
		ba.withdraw(100000);	//90000�� ���
		ba.withdraw(200000);	//500000�� ���
	}
}
