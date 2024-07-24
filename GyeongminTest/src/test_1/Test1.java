package test_1;
import java.util.Scanner;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		Random random = new Random();
		String player = scanner.next();
		int a = random.nextInt(2);
		switch(a) {
		case 0:System.out.println("0가위");
		break;
		case 1:System.out.println("1바위");
		break;
		case 2:System.out.println("2보");
		break;
		}
		switch(player) {
		case "가위":
			if(a==0) {
				System.out.println("비겼습니다");
			}else if(a==1) {
				System.out.println("졌습니다");
			}else if(a==2) {
				System.out.println("이겼습니다");
			}
			break;
		case "바위":
			if(a==0) {
				System.out.println("이겼습니다");
			}else if(a==1) {
				System.out.println("비겼습니다");
			}else if(a==2) {
				System.out.println("졌습니다");
			}
			break;
		case "보":
			if(a==0) {
				System.out.println("졌습니다");
			}else if(a==1) {
				System.out.println("이겼습니다");
			}else if(a==2) {
				System.out.println("비겼습니다");
			}
			break;
		}
		
	}

}
