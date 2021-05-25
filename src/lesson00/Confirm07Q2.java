package lesson00;

public class Confirm07Q2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		Random rand = new Random();
		//    int num = rand.nextInt(100) ;
		int num = 79;
		String score = null;
		if (num >= 80) {
			score = "優";
		} else if (num >= 65) {
			score = "良";
		} else if (num >= 50) {
			score = "可";
		} else {
			score = "不可";
		}
		System.out.println(score + "です");
	}

}
