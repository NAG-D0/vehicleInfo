public class Vehicle {
	private String name;
	private int currentdirection;
	private int currentspeed;
	public Vehicle(String name) {
		this.name = name;
		this.currentdirection = 0;
		this.currentspeed = 0;
	}
	public void steer(int direction) {
		currentdirection+=direction;
		System.out.println("Steer method is called || : steering at : "+currentdirection+" degrees");
	}
	public void move(int speed,int direction) {
		currentspeed=speed;
		currentdirection=direction;
		System.out.println("Move method is called || : moving at : "+currentspeed+" speed in the direction "+currentdirection);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentdirection() {
		return currentdirection;
	}
	public void setCurrentdirection(int currentdirection) {
		this.currentdirection = currentdirection;
	}
	public int getCurrentspeed() {
		return currentspeed;
	}
	public void setCurrentspeed(int currentspeed) {
		this.currentspeed = currentspeed;
	}
	public void stop() {
		this.currentspeed=0;
		System.out.println("Vehicle is stopped !!!!");
		System.out.println("PLEASE  LOCK THE CAR SAFELY !!!!");
	}
}
