package lesson00;

public abstract class Arbeit {
	int wages;

	public abstract void calculate(int hour);

	void display() {
		System.out.println(this.wages + "円入手しました。");
	}
}
