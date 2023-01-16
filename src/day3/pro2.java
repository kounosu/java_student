package day3;

import java.util.Random;

public class pro2 {

	public static void main(String[] args) {
		/* 1から10までの乱数を発生させてそれを画面に表示し、
		 * その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。*/
		Random rand = new Random();
		int num = rand.nextInt(10)+1;
		System.out.println(num);
		if( num == 1) {
			System.out.println("１ではありません");
		} 
	}

}
