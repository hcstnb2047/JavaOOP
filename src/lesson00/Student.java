package lesson00;

public abstract class Student {
	void study(int hour) {
		System.out.println("自宅で" + hour + "時間勉強しました。");
	}

	abstract void work(int hour);
}
