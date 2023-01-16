package day3;

import java.util.Random;

public class pro3 {

	public static void main(String[] args) {
		// 1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
		
		if( 10 >= num || num >= 90 ) {
			System.out.println("10以下か90以上の値です");
		}
	}

}
