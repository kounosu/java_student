package day5;

/*整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。
大きさは、10
値は、１から100の乱数 
このとき、実行例のように、値をすべて表示し、その中の偶数の数と、奇数の数を表示するようにしなさい。*/

public class pro2 {
	public static void main(String[] args) {
		int data[] = new int[10];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.print("奇数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		System.out.print("偶数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}
}
