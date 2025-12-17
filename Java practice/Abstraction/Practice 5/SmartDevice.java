public abstract class SmartDevice {
    private String name;
    public boolean isOn;

    public SmartDevice(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        boolean isOn = false;
        if (isOn == true) {
            System.out.println("Already On!");
        } else {
            System.out.println("Turn On.");
        }
    }

    public void turnOff() {

    }

    public abstract String getStatus();
}
