class InvalidWithdraw extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}	//생성자: msg = 예외의 메시지 이름
}	//새로운 예외 InvalidWithdraw 구현 - 비체크예외
public class BankAccount {
	private int minmoney;	//최저 잔금
	private int repository;	//잔금
	public BankAccount() {
		minmoney = 0;
	}	//최저잔금을 0으로 초기화하는 생성자
	public BankAccount(int min) {
		minmoney = min;
	}	//최저잔금을 저장할 수 있는 필드를 지정하는 생성자
	public void deposit(int money) {
		repository += money;
		System.out.println("정상 입금처리: 입금금액=" + money + ", 잔금=" + repository);
	}	//입금 메소드
	public int withdraw(int money) throws InvalidWithdraw {
		if (money <= 0)	//인출 요청 금액이 음수이면 예외발생
			throw new InvalidWithdraw("음수 금액입니다.");
		else if (repository - money < minmoney)	//인출 요청 금액이 최저 잔금 이하면 예외발생
			throw new InvalidWithdraw("초과출금 요구 예외.");
		else {	//정상적인 경우에는
			repository -= money;	//잔금이 요청 금액만큼 줄어듬
			System.out.println("정상 출금처리: 인출금액=" + money + ", 잔금=" + repository);
			return minmoney;	//최저 잔금을 리턴
		}
	}	//출금 메소드
}
