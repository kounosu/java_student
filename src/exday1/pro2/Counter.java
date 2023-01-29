package exday1.pro2;

public class Counter {
	//  カウント
    private int count = 0;
    private static int totalCount = 0;
    //  コンストラクタ
    public void reset(){
        count = 0;
    }
    //  カウント
    public void count(){
        count++;
    }
    //  値の取得
    public int getCount(){
        return count;
    }
    
    public static int getTotalCount() {
		return totalCount;
    }
}
