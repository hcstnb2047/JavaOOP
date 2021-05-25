package lesson00;

public class Confirm10Q1 {

	public static void main(String[] args) {
		Confirm10Q1 c = new Confirm10Q1();
		int num = 100;
		int temp = c.duplicate(num);
		System.out.println("渡した数値[" + num + "]の倍数は" + temp);
	}

	public int duplicate(int num) {
		return num * 2;
	}

}
