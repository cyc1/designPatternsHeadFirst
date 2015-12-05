public interface FlyBehavior {
	public void fly();
}

class FlyWithWings implements FlyBehavior {
	public void fly(){
		System.out.println("i'm flying!!");
	}
}

class FlyNoWay implements FlyBehavior {
	public void fly(){
		System.out.println("i can't fly");
	}
}

class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("i'm flying with a rocket!");
	}
}
