package week1.day1;

public class Car {
	public void drivecar () {
		System.out.println("Driving the Car");
		
	}
	public void applybreak() {
		System.out.println("Apply Break");
	}
	public void soundhorn() {
		System.out.println("Sound Horn");
	}
	public void ispuncture() {
		System.out.println("The Car is Puncture");
	}
public static void main(String[] args) {
	Car obj = new Car();
	obj.drivecar();
	obj.applybreak();
	obj.soundhorn();
	obj.ispuncture();
}
}
