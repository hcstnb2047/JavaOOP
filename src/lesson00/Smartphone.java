package lesson00;

public class Smartphone extends Phone implements Music {
	String address;

	void mail() {
		System.out.println("メールできます。");
	}

	@Override
	public void listen() {
		System.out.println("音楽が聴けます。");

	}
}
