package lesson00;

public class Confirm13Q1 {

	public static void main(String[] args) {
		GamePlayer gp = new GamePlayer();
		String name1 = "格闘ゲーム";
		String name2 = "カンフー映画";
		int time = 2;
		gp.play(name1);
		gp.play(name2, time);

	}

}
