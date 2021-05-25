package lesson00;

public class GasStation extends Arbeit {
	int hw = 1000;

	@Override
	public void calculate(int hour) {
		System.out.println("スタンドで" + hour + "時間働きました");
		this.wages = hour * hw + 500;
	}

}
