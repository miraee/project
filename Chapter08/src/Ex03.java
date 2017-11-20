public class Ex03 {

	public static void main(String[] args) throws InvalidWithdraw {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(-100000);	//최저잔금을 -100000로 지정하는 BankAccount객체 생성
		ba.deposit(100000);	//100000을 입금
		ba.withdraw(100000);	//90000을 출금
		ba.withdraw(200000);	//500000을 출금
	}
}
