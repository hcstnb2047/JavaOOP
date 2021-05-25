package lesson00;

public class Confirm12Q2 {
	int[] distribution = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void main(String[] args) {
		Confirm12Q2 c1 = new Confirm12Q2();
		Confirm12Q2 c2 = new Confirm12Q2();
		for (int i = 0; i < 10; i++) {
			c1.randomNum();
			c2.randomNum();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + i + "]が出た回数：" + (c1.distribution[i] + c2.distribution[i]));
		}

	}

	public void randomNum() {
		int ret = (int) (Math.random() * 10);
		this.distribution[ret]++;
	}
}
