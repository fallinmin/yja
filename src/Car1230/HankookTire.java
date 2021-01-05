package Car1230;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire �닔紐�: " + (maxRotation - accumulatedRotation) + "�쉶");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire �럱�겕 ***");
			return false;
		}
	}
}
