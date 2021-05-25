package lesson00;

public class Pattern1 extends Student {

	@Override
	void work(int hour) {
		Convenience cv = new Convenience();
		cv.calculate(hour);
		cv.display();

	}

}
