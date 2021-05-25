package lesson00;

public class Confirm16Q1 {

	public static void main(String[] args) {
		GasStation gs = new GasStation();
		Convenience cv = new Convenience();
		CDshop cds = new CDshop();

		gs.calculate(3);
		gs.display();
		cv.calculate(4);
		cv.display();
		cds.calculate(2);
		cds.display();
	}

}
