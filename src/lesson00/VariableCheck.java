package lesson00;

public class VariableCheck {
	static int classVariable = 0;
	int instanceVariable = 0;

	public void plus() {
		VariableCheck.classVariable++;
		this.instanceVariable++;
	}

	public void minus() {
		VariableCheck.classVariable--;
		this.instanceVariable--;
	}
}
