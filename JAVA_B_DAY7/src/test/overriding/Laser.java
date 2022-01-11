package test.overriding;

public class Laser extends weapon {
	@Override
	public void fire() {
		System.out.println("지이잉");
	}
}
