package lesson00;

public class Confirm16Q2 {

	public static void main(String[] args) {
		Pattern1 tomoko = new Pattern1();
		Pattern1 tatsuhiro = new Pattern1();
		Pattern2 nobuyasu = new Pattern2();

		System.out.println("tomokoの生活です。");
		tomoko.work(3);
		tomoko.study(3);
		System.out.println("tatsuhiroの生活です。");
		tatsuhiro.work(1);
		tatsuhiro.study(5);
		System.out.println("nobuyasuの生活です。");
		nobuyasu.work(2);
		nobuyasu.study(5);
	}

}
