package test_1;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int bullet=0;
		int p1_hp=3;
		int p2_hp=3;
		int live=0;
		int blank=0;
		
		do {
				bullet = random.nextInt(8);
		}	while(bullet<1);//총알뽑기
		int[] mag = new int[bullet];
		do {
		for(int i = 0 ; i < mag.length ; i++){
			int bulletdmg = random.nextInt(2);
			mag[i] = bulletdmg;
			if(bulletdmg==1) {
				live=live+1;
			}else {
				blank=blank+1;
			}
		}
		}while(live<=0);
		System.out.println("실탄은"+live);
		System.out.println("공포탄은"+blank);
		
		
	}

}
