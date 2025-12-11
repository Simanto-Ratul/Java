public class Main {
    public static void main(String[] args) {
        Insurance i1 = new CarInsurance("TX234", "Simanto", 2000.45);
        System.out.println("Car Insurance Covarage: " + i1.calculateCovarage());
        i1.renewPolicy();
        i1.displayPolicy();

        Insurance i2 = new MotorCycleInsurance("XYZ1567", "Ratul", 2345.98);
        System.out.println("Motor Cycle Insurance Covarage: " + i2.calculateCovarage());
        i2.renewPolicy();;
        i2.displayPolicy();

        Insurance i3 = new TruckInsurance("FTSR735", "Rahul", 52334.365);
        System.out.println("Truck Insurance covarage: "+ i3.calculateCovarage());
        i3.renewPolicy();;
        i3.displayPolicy();
    }
}
 