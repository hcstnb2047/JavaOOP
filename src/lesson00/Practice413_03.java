package lesson00;

public class Practice413_03 {
	public static void main(String[] args) {
		Runner man1, man2, man3;
		man1 = new Runner();
		man1.running();
		man2 = new Runner("純一郎");
		man2.running();
		man3 = new Runner("晋三", 20);
		man3.running();
	}
}
