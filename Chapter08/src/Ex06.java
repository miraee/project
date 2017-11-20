public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new PrimeNumber03(20, "소수 만드는 스레드")).start();
		//1에서 20까지의 소수 출력
	}

}
