package test_1;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int bullet = 0;
		int p1_hp = 1;
		int p2_hp = 1;
		int bulletloc;
		int turn = 1;
 
		bullet = random.nextInt(6);
		bullet = bullet + 2;
		System.out.println("실린더 : " + bullet);// 실린더 수

		int[] mag = new int[bullet]; // 실린더 배열
		bulletloc = random.nextInt(bullet); // 실탄 위치

		for (int i = 0; i < mag.length; i++) {
			if (i == bulletloc) {
				mag[i] = 1;
			} else if (i != bulletloc) {
				mag[i] = 0;
			}
		}
		while (p1_hp + p2_hp >= 2) {
			if (turn % 2 != 0) {
				System.out.println("플래이어1 차례");
				System.out.println("실린더를 선택해주세요.ex)1,2,3...");
				for (int i = 0; i < mag.length; i++) {
					if (mag[i] == -1) {
						System.out.println(i + 1 + "번째 [X]");
					} else if (mag[i] >= 0) {
						System.out.println(i + 1 + "번째 [?]");
					}

				}
				int playerbul = sc.nextInt();
				playerbul = playerbul - 1;
				System.out.println("누구에게 쏠건가요? ex)나,상대");
				String choose = sc.next();
				if (choose.equals("나")) {
					System.out.println("나 선택");
					p1_hp = p1_hp - mag[playerbul];
					mag[playerbul]--;
					turn = turn + 2;
				} else if (choose.equals("상대")) {
					System.out.println("상대 선택");
					p2_hp = p2_hp - mag[playerbul];
					mag[playerbul]--;
					turn++;
				}
			} else if (turn % 2 == 0) {
				System.out.println("플래이어2 차례");
				System.out.println("실린더를 선택해주세요.ex)1,2,3...");
				for (int i = 0; i < mag.length; i++) {
					if (mag[i] == -1) {
						System.out.println(i + 1 + "번째 [X]");
					} else if (mag[i] >= 0) {
						System.out.println(i + 1 + "번째 [?]");
					}

				}
				int playerbul = sc.nextInt();
				playerbul = playerbul - 1;
				System.out.println("누구에게 쏠건가요? ex)나,상대");
				String choose = sc.next();
				if (choose.equals("나")) {
					System.out.println("나 선택");
					p2_hp = p2_hp - mag[playerbul];
					mag[playerbul]--;
					turn = turn + 2;
				} else if (choose.equals("상대")) {
					System.out.println("상대 선택");
					p1_hp = p1_hp - mag[playerbul];
					mag[playerbul]--; 
					turn++;
				}
			}
			if(p1_hp<1) {
				System.out.println("플래이어 2승리");
			}else if(p2_hp<1) {
				System.out.println("플래이어 1승리");
			}//승패 출력

		}
	}
}
