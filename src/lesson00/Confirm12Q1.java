package lesson00;

public class Confirm12Q1 {

	public static void main(String[] args) {
		VariableCheck vc1 = new VariableCheck();
		VariableCheck vc2 = new VariableCheck();

		for (int i = 0; i < 50; i++) {
			vc1.plus();
			vc2.minus();
		}
		System.out.println("プラス側のクラス変数 \t: " + vc1.classVariable);
		System.out.println("プラス側のインスタンス変数\t:" + vc1.instanceVariable);
		System.out.println("マイナス側のクラス変数\t:" + vc2.classVariable);
		System.out.println("マイナス側のインスタンス変数\t:" + vc2.instanceVariable);

	}
}
