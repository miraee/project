public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTime p1 = new PrintTime(3);	//PrintTime 按眉积己
		Thread th1 = new Thread(p1, "救崇窍技夸!");	//Thread 按眉积己
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);	//PrintTime 按眉积己
		Thread th2 = new Thread(p2, "馆癌嚼聪促!");	//Thread 按眉积己
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
