package day6.pro2;

public class pro2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calc c = new Calc();
        double a = 4.0,b = 2.0;
        System.out.println(a + " + " + b + " = " + c.add(a,b));
        System.out.println(a + " - " + b + " = " + c.sub(a,b));
        System.out.println(a + " * " + b + " = " + c.mull(a,b));
        System.out.println(a + " / " + b + " = " + c.div(a,b));
	}

}
