package day3;

import java.util.Random;

public class pro1 {

	public static void main(String[] args) {
		// 1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。
		Random rand = new Random();
	    int num = rand.nextInt(10);
		System.out.println(num);
		if( num > 5) {
			System.out.println("５以上です");
		}
	}

}
