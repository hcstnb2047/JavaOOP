package lesson00;

public class Runner {
	String name;
	int dist;

	public Runner() {
		// TODO 自動生成されたコンストラクター・スタブ
		name = "Nameless";
		dist = 10;
	}

	public Runner(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this();
		this.name = name;
	}

	public Runner(String name, int dist) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.dist = dist;
	}

	public void running() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "は" + dist + "km走りました。");
	}

}
