package lesson00;

public class Confirm10Q2 {

	public static void main(String[] args) {
		Confirm10Q2 c1 = new Confirm10Q2();
		int num = 100;
		int temp = c1.duplicate(num);
		System.out.println("渡した数値[" + num + "]の倍数は" + temp);
		temp = c1.triplicate(num);
		System.out.println("渡した数値[" + num + "]の3倍の数は" + temp);
	}

	public int duplicate(int num) {
		return num * 2;
	}

	public int triplicate(int num) {
		return num * 3;
	}

}
