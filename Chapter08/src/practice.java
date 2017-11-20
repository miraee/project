import java.util.InputMismatchException;
import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 0, z = 0;	//x,y,z 값 초기화
		Scanner input = new Scanner(System.in);	//표준입력위한 객채 생성
		
		try {
			x = input.nextInt();	//x값 정수로 입력받음
			y = input.nextInt();	//y값 정수로 입력받음
			z = x * y;	//z = x 곱하기 y
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(InputMismatchException e) {	//정수가 아닌 값이 입력됐을 때 예외처리
			System.out.println("잘못된 입력입니다.");
		}
	}
}
