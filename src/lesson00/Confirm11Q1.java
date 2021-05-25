package lesson00;

public class Confirm11Q1 {

	public static void main(String[] args) {
		CalcNormal cn = new CalcNormal();

		int no1 = 100;
		int no2 = 50;
		int temp = cn.add(no1, no2);
		System.out.println("Normalの加算結果 : " + temp);
		temp = CalcStatic.add(no1, no2);
		System.out.println("Staticの加算結果 : " + temp);
		temp = cn.subtract(no1, no2);
		System.out.println("Normalの減算結果 : " + temp);
		temp = CalcStatic.subtract(no1, no2);
		System.out.println("Staticの減算結果 : " + temp);
	}

}
