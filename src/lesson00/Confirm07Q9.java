package lesson00;

public class Confirm07Q9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//		Random rand = new Random();
		//    int num = rand.nextInt(100) ;
		int[] score = { 57, 60, 89, 32, 66, 77, 92, 45 };
		int max = 0;
		int min = 65535;
		for (int i : score) {
			if (i < min) {
				min = i;
			} else if (i > max) {
				max = i;
			}
		}
		System.out.println("最高点：" + max);
		System.out.println("最低点：" + min);
	}

}
