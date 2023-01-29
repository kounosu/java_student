package expro3.pro;

public class FighterAiracraft extends AirPlane{

	public FighterAiracraft() {
		type = "戦闘機";
	}
	@Override
	//  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
    //  戦闘する
    public void fight(){
        System.out.println("戦闘します。");
    }
}
