package day4;

public class pro4 {

	public static void main(String[] args) {
		int num = 1; // とりあえず -1
		while (num < 10) {
			num = 1 + (int) (Math.random() * 10.0);
			System.out.println(num);
		}
		if( num == 10) {
			System.out.println("終了します");
		}
	}
}
