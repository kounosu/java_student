package day6.pro1;

public class Minmax {

//  最大値の取得
    public int max(int n1,int n2, int n3){
        if (n1 > n3){
            return n1;
        }
        return n2;
    }
    //  最大値の取得
    public int min(int n3,int n2,int n1){
        if (n1 < n3){
            return n1;
        }
        return n2;
    }

}
