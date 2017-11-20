import java.util.LinkedList;
public class PrimeNumber03 implements Runnable {
// 클래스PrimeNumber03는 인터페이스 Runnable을 구현하는 클래스
	private int number;	//number 필드구현
	private String name;	//name 필드구현
	LinkedList<Integer> prime = new LinkedList<>();
	
	public PrimeNumber03(int number, String name) {
		this.number = number;
		this.name = name;
	}	//number와 이름을 지정하는 생성자
	
	public void run() {
		System.out.println(this.name + ":");
		int j;
		for(int i = 2; i <= this.number; i++) {	//이중for문실행
			for(j = 2; j < i; j++) {
				if(i % j == 0)	//i가 j의 배수이면
					break;	//멈추고 나감
			}
			if(j == i)	//j랑 i가 같으면
				prime.add((Integer)j);	//정수형 j를 추가
		}
		System.out.println(prime.toString());
		prime.clear();
	}
}
