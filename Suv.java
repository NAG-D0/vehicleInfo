
public class Suv extends Car {
	public Suv(String name,boolean isManual) {
		super(name, 4, 5, 6, isManual);
		// TODO Auto-generated constructor stub
	}
	public void accelerate(int rate) {
		int newspeed = getCurrentspeed()+rate;
		if(newspeed==0) {
			
			changeGeartoneutral("NEUTRAL");
			stop();
		}
		else if(newspeed > 0 && newspeed<=10) {
			changeGear(1);
		}
		else if(newspeed > 10 && newspeed<=20) {
			changeGear(2);
		}
		else if(newspeed > 20 && newspeed<=30) {
			changeGear(3);
		}
		else if(newspeed > 30 && newspeed<=40) {
			changeGear(4);
		}
		else if(newspeed > 40 && newspeed<=70) {
			changeGear(5);
		}
		else {
			changeGear(6);
		}
		if(newspeed > 0) {
			changeSpeed(newspeed,getCurrentdirection());
		}
	}
}
