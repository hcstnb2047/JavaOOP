package lesson00;

public class Convenience extends Arbeit {
	int hw = 1000;

	@Override
	public void calculate(int hour) {
		System.out.println("コンビニで" + hour + "時間働きました。");
		this.wages = hour * hw;

	}

}
