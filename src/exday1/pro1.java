package exday1;
/*以下のプログラムは、1から10の2つ乱数を発生させ、その和を求めるものである。
 同様に、二つの数の差を求める静的メソッド、sub()を追加し、最後に、その結果も表示するようにしなさい。*/
public class pro1 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1; //  1～10の乱数を発生
		int b = (int) (Math.random() * 10) + 1; //  1～10の乱数を発生
		int result = add(a, b); //  二つの数の和を求める
		int result1 = sub(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a + " + " + b + " = " + result);
		System.out.println(a + " - " + b + " = " + result1);

	}

	//  足し算
	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}
}
