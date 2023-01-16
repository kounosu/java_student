package day3;

import java.util.Random;

public class pro4 {
	public static void main(String[] args) {
		/*１から100までの数値を乱数で発生させて表示し、以下の処理を行いなさい。
		80点以上なら”優”と表示。
		80点未満、70点以上なら、”良”と表示。
		70点未満、60点以上なら、”可”と表示。
		60点未満なら、”不可”と表示。*/
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
		
		if( num >= 80) {
			System.out.println("優");
		}else if( 70 <= num && num <= 80) {
			System.out.println("良");
		}else if( 60 <= num && num <= 70) {
			System.out.println("可");
		}else if( num <= 60 ){
			System.out.println("不可");
		}
	}
}
