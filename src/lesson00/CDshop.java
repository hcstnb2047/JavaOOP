package lesson00;

public class CDshop extends Arbeit {
	int hw = 850;

	@Override
	public void calculate(int hour) {
		System.out.println("CDショップで" + hour + "時間働きました");
		this.wages = hour * hw;
	}

}
