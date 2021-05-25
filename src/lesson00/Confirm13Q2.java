package lesson00;

public class Confirm13Q2 {

	public static void main(String[] args) {
		Arithmetic arith = new Arithmetic();
		int no1 = 5;
		int no2 = 8;
		int no3 = 11;
		int temp;
		temp = arith.calcilate(no1);
		System.out.println("数値を１つ[" + no1 + "]を渡した結果：" + temp);
		temp = arith.calcilate(no1, no2);
		System.out.println("数値を2つ[" + no1 + "," + no2 + "]を渡した結果：" + temp);
		temp = arith.calcilate(no1, no2, no3);
		System.out.println("数値を2つ[" + no1 + "," + no2 + "," + no3 + "]を渡した結果：" + temp);

	}

}
