import java.util.Date;
public class PrintTime implements Runnable {
//클래스 PrintTime은 인터페이스 Runnable을 구현하는 클래스
	private int count;	//count필드생성
	public PrintTime(int count) {
		this.count = count;
	}	//count를 지정하는 생성자

	public void run() {
		Date current = new Date();	//Date객체생성
		while (count != 0) {	//count가 0이 아닐때까지 반복
			System.out.println("순위: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {	
				Thread.sleep(1000);
				current = new Date();	//Date객체생성
			} catch (InterruptedException e) {}	//예외처리
		}
	}
}
