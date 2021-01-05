package Car1230;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire �닔紐�: " + (maxRotation - accumulatedRotation) + "�쉶");
			return true;
		} else {
			System.out.println("*** " + location + " Tire �럱�겕 ***");
			return false;
		}
	}
}
