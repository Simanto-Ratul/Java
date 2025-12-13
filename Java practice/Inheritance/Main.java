public class Main {
    public static void main(String[] args) {
        Insurance i1 = new CarInsurance("TX87534", "Davidson", 40000, "015243263");
        i1.showDetails();
        System.out.println("-----------------");

        Insurance i2 = new TruckInsurance("KW52313", "Stephenson", 500000, "01225488545");
        i2.showDetails();
        System.out.println("-----------------");

        Insurance i3 = new MotorCycleInsurance("XNW73455", "Jhonson", 20000, "0173428436");
        i3.showDetails();
    }
}
