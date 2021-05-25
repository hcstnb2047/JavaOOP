package lesson00;

public class Confirm07Q8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		Random rand = new Random();
		//    int num = rand.nextInt(100) ;
		String str;
		for (int i = 0; i < 5; i++) {
			str = "";
			for (int j = 0; j <= i; j++) {
				str += "*";
			}
			System.out.println(str);
		}
	}

}
