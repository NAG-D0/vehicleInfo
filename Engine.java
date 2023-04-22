public class Engine {
	public static void main(String[] args) {
		Suv Swift = new Suv("SWIFT",false);
//		ON DRIVING------->>>>>
		Swift.setName("SWIFT DZIRE");
		System.out.println("CAR NAME IS : "+Swift.getName());
		Swift.move(40, 0);
		Swift.accelerate(20);
		Swift.accelerate(20);
		System.out.println("Current Gear : "+Swift.getCurrentgear());
		System.out.println("Current Speed : "+Swift.getCurrentspeed());
		Swift.accelerate(-80);
		
	}
}
