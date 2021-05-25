package lesson00;

public class Country {
	String name;
	double population;

	public Country() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = "日本";
		this.population = 1.3;
	}

	public Country(String name, double population) {
		this.name = name;
		this.population = population;
	}

	public void show() {
		System.out.println(this.name + "の人口は" + this.population + "億人です。");
	}

}
