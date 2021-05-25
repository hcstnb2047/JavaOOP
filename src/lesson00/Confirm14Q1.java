package lesson00;

public class Confirm14Q1 {

	public static void main(String[] args) {
		Bus bus = new Bus();
		PatrolCar pc = new PatrolCar();
		bus.put(5);
		bus.drive(20);
		bus.drop(3);
		pc.siren();
		pc.drive(10);

	}

}
