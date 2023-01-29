package expro3.pro;

public class PassengerPlane extends AirPlane{

	public PassengerPlane() {
		type = "旅行機";
	}
    //  飛行する
    public void fly(){
        System.out.println("乗客を乗せて目的地まで飛行します。");
    }
    //  戦闘する
    public void carryPassengers(){
        System.out.println("乗客を目的地まで運びます。");
    }

}
