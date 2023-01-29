package day6.pro1;

/*以下のプログラムを改造し、クラスMinMaxのメンバ関数max(),min()の引数の数を3つにし、
期待される実行結果にならい、3つの数の最大値・最小値を出せるようにプログラムを改造しなさい。*/
public class Pro6_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Minmax m = new Minmax();
        int a = 4,b = 3,c = 2;
        System.out.println(a + "と" + c + "のうち、最大のものは" + m.max(a, b, c));
        System.out.println(a + "と" + c + "のうち、最小のものは" + m.min(a, b, c));
	}

}
