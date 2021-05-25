package lesson00;

public class AdultSparrow extends Sparrow {
	@Override
	void eat() {
		super.eat();
		System.out.println("大人になると主食が種子に変化します。");
	}
}
