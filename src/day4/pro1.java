package day4;

import java.util.Random;

public class pro1 {

	/* １から10までの乱数を発生させ、その数を表示した後、
	forループを用いて、その数だけ■マークを表示するプログラムを作りなさい。*/
	public static void main(String[] args) {
		Random rand = new Random();

		// 1～10までの乱数を発生
		// nextInt(10)は0～9までの数字を発生させる
		// そのためプラス1をして1～10までの数字をrandomNum変数に代入している
		int num = rand.nextInt(10) + 1;
		// ランダムに発生した数を表示
		System.out.println(num);

		// 1～randomNum以下まで繰り返します
		for ( int i = 1; i <= num; i++) {
			// ■マークの表示
			// 横一列に並べたいため改行をしないprintを使用
			System.out.print( "□" + " ");
		}
	}
}
