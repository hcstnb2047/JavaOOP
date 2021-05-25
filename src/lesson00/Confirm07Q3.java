package lesson00;

public class Confirm07Q3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		Random rand = new Random();
		//    int num = rand.nextInt(100) ;
		int month = 2;
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "春";
			break;
		case 6:
		case 7:
		case 8:
			season = "夏";
			break;
		case 9:
		case 10:
		case 11:
			season = "秋";
			break;
		case 12:
		case 1:
		case 2:
			season = "冬";
			break;

		}
		System.out.println(season + "です");
	}

}
