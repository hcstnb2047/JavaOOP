package lesson00;

public class Confirm08Q2 {

	public static void main(String[] args) {
		Confirm08Q2 cf1 = new Confirm08Q2();
		Confirm08Q2 cf2 = new Confirm08Q2();
		Confirm08Q2 cf3 = new Confirm08Q2();
		cf1.morningGreet();
		cf2.daytimeGreet();
		cf3.nightGreet();
	}

	public void morningGreet() {
		System.out.println("おはようございます！");
	}

	public void daytimeGreet() {
		System.out.println("こんにちは！");
	}

	public void nightGreet() {
		System.out.println("こんばんは！");
	}

}
