
public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private String type;
    private boolean isManual;
    private int currentgear;
        public Car(String name,int wheels,int doors,int gears,boolean isManual) {
            // TODO Auto-generated constructor stub
            super(name);
            this.wheels=wheels;
            this.doors=doors;
            this.gears=gears;
            this.isManual=isManual;
            this.type=type;
            currentgear=1;
        }
        public void changeGear(int newgear) {
            this.currentgear=newgear;
            System.out.println("Changegear method is called || : Gear Changed to "+this.currentgear+" gear");
        }
        public void changeGeartoneutral(String g) {
            String gir=g;
            System.out.println("Changegear method is called || : Gear Changed to "+gir+" gear");
        }
        public void changeSpeed(int newspeed,int newdirection) {
         move(newspeed,newdirection);
         System.out.println("Changespeed method is called || : Speed at "+newspeed+" direction of "+newdirection);
        }
        public int getWheels() {
            return wheels;
        }
        public void setWheels(int wheels) {
            this.wheels = wheels;
        }
        public int getDoors() {
            return doors;
        }
        public void setDoors(int doors) {
            this.doors = doors;
        }
        public int getGears() {
            return gears;
        }
        public void setGears(int gears) {
            this.gears = gears;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public boolean isManual() {
            return isManual;
        }
        public void setManual(boolean isManual) {
            this.isManual = isManual;
        }
        public int getCurrentgear() {
            return currentgear;
        }
        public void setCurrentgear(int currentgear) {
            this.currentgear = currentgear;
        }
        
    }
    