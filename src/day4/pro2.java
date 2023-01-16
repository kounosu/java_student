package day4;

import java.util.Random;

public class pro2 {

	/* １から10までの乱数を発生させ、その数を表示した後、
	whileループを用いて、その数だけ■マークを表示するプログラムを作りなさい。*/
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println(num);
		
		int i = 1;
		while( i <= num ) {
			System.out.print( "□" + " ");
			i++;
		}
	}

}
