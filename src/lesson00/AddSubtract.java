package lesson00;

public class AddSubtract {
	int result;

	void add(int no1, int no2) {
		this.result = no1 + no2;
	}

	void substract(int no1, int no2) {
		this.result = no1 - no2;
	}

	void display() {
		System.out.println("現在の結果は[" + this.result + "]です");
	}
}
