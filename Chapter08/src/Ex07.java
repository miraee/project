public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTime p1 = new PrintTime(3);	//PrintTime ��ü����
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");	//Thread ��ü����
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);	//PrintTime ��ü����
		Thread th2 = new Thread(p2, "�ݰ����ϴ�!");	//Thread ��ü����
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
